![image](https://user-images.githubusercontent.com/22589593/124494007-99db3b00-ddb6-11eb-9ffa-97be31fefb35.png)

# ConnectGov
A project helping connect municipalities with similar problems based on the Self Organising Maps AI algorithm.

Submitted as part of the [BIG hackathon 2021](https://euhack21.bemyapp.com/)
![image](https://user-images.githubusercontent.com/22589593/124494107-baa39080-ddb6-11eb-981f-80f4b17073f4.png)


## Presentation
See summary presentation here:
https://docs.google.com/presentation/d/1eKSb55Fo2qkk7IUtFgNY2g8iTeiwdY71WxRHwyDFhG8/edit#slide=id.ge3987965f0_2_745


## Deployment
### Base web app
Most of the application is implemented in server side Kotlin, so to deploy it npm is needed.

First, download this source code [or clone the repo](https://github.com/Plavit/ConnectGov/)

Once you have downloaded the example install the dependencies and run the app. It might take a while the first time you do this.

```bash
npm install
npm run dev
```

The application should look somewhat like this:
![image](https://user-images.githubusercontent.com/22589593/124493567-13bef480-ddb6-11eb-9bf0-4ac7b80f75c6.png)


### AR Extension
Currently requires Unity to be run. After adapting the requirements file to reflect your system's installation folder, you can run the application after giving it access to a camera. Use the provided target picture to visualise demo data like so:

![image](https://user-images.githubusercontent.com/22589593/124493508-00138e00-ddb6-11eb-8ddf-0d5f10e67ea4.png)


## Acknowledgements
Based on research done as part of my study at the University of Cambridge and Czech Technical University
Some data and frameworks were provided with great help by colleagues [*__Pavel Krulec__*](https://github.com/harakiwi1) and *__Šimon Mandlík__*
