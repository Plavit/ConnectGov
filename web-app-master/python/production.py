import json
import numpy as np
from minisom import MiniSom
from collections import OrderedDict


def production(query_file, out_file, db_file):
    with open(query_file) as f:
        query = OrderedDict(json.load(f))

    with open(db_file) as f:
        data = OrderedDict(json.load(f))

    N = len(data)
    F = len(query)

    ids = []
    location = []
    np_data = np.zeros((N, F))
    for (i, (k, d)) in enumerate(data.items()):
        for (j, f) in enumerate(query.keys()):
            np_data[i, j] = float(d[f])
        ids.append(k)

    S = 5
    som = MiniSom(S, S, F, sigma=0.5, learning_rate=0.5)
    # som.pca_weights_init(np_data)
    som.random_weights_init(np_data)
    # som.train_random(np_data, 100, verbose=True)
    som.train_random(np_data, 1000, verbose=True)

    res = []
    w_q = som.winner([float(query[k]) for k in query.keys()])
    # res["cluster"] = str(w[0] * S + w[1])

    for i in range(N):
        x = np_data[i, :]
        w = som.winner(x)
        if w == w_q:
            # k = str(w[0] * S + w[1])
            res.append(data[ids[i]])

    with open(out_file, 'w') as f:
        json.dump(res, f)


if __name__ == "__main__":
   # with open('/home/pavel/Downloads/somefile.txt', 'a') as the_file:
   #     the_file.write('Hello\n')
   # exit;


    import sys
    production(sys.argv[1], sys.argv[2], sys.argv[3])


