![image](https://user-images.githubusercontent.com/22589593/124494007-99db3b00-ddb6-11eb-9ffa-97be31fefb35.png)

# ConnectGov
A project helping connect municipalities with similar problems based on the Self Organising Maps AI algorithm.

Submitted as part of the [BIG hackathon 2021](https://euhack21.bemyapp.com/) on 5 July 2021
![image](https://user-images.githubusercontent.com/22589593/124494107-baa39080-ddb6-11eb-981f-80f4b17073f4.png)


## Presentation
See summary presentation here:
https://docs.google.com/presentation/d/1eKSb55Fo2qkk7IUtFgNY2g8iTeiwdY71WxRHwyDFhG8/edit#slide=id.ge3987965f0_2_745

## Architecture
The app uses an algorithm to divide provided municipality datasets into 9 groups based on similar characteristics, which implies they are facing similar problems. Then, a general web based user interface is used to cisualise the resulting data and allow municipalities to find similar places to cooperate with. Efficient communication between the matched municipalities can be reached via X-Road.

On the following picture you can see the overall architecture, with some added commentary below:
![image](https://user-images.githubusercontent.com/22589593/124495672-b1b3be80-ddb8-11eb-9729-7764e9bc6d49.png)

### AI clustering
The AI Clustering algorithm "Self Organising Maps" was created in Python via a JuPyTer notebook as a proof of concept based on available data from the Czech Republic.

### Web App interface
 #### Backend
 Backend is made by combined Kotlin and Java/Spring implementation, with python scripts connecting to the AI algorithm dataset
 #### Frontend
 Frontend uses regular HTML, CSS, JS suite, utilising Corpis Maps API for visualisations
 
### Communication via X-Roads
Unfortunately, the integration with X-Roads is not fully complete as it proved challenging. However, the plan is that after the municipalities are matched, they can share selected sensitive datasets via the existing X-Road framework and protocols.

### AR visualisation
The AR visualisation is implemented using the Vuforia API, which works on PC and Android via Unity. The source code is somewhat bloated, so only the resulted package is provided.


## Deployment
### Base web app
Most of the application is implemented in server side Kotlin, so to deploy it npm is needed.

First, download this source code  in folder ```web-app-master``` or [clone the repo](https://github.com/Plavit/ConnectGov/)

Once you have downloaded the example install the dependencies and run the app. It might take a while the first time you do this.

```bash
npm install
npm run dev
```

Unless you specify otherwise in the package, the app will run locally on port 4200 by default.

The application should look somewhat like this:
![image](https://user-images.githubusercontent.com/22589593/124493567-13bef480-ddb6-11eb-9bf0-4ac7b80f75c6.png)


### AR Extension
Currently requires Unity to be run. After adapting the requirements file to reflect your system's installation folder, you can run the application after giving it access to a camera. Use the provided target picture to visualise demo data like so:

![image](https://user-images.githubusercontent.com/22589593/124493508-00138e00-ddb6-11eb-8ddf-0d5f10e67ea4.png)

Here is a video demo:
![image](graphics/ar-demo.gif)


## Acknowledgements
Based on research done as part of my study at the University of Cambridge and Czech Technical University
Some data and frameworks were provided with great help by colleagues [*__Pavel Krulec__*](https://github.com/harakiwi1) and [*__Šimon Mandlík__*](https://github.com/SimonMandlik)

The author declares no conflicts of interest as part of this submission.
