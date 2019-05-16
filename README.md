#Instructions

To build this project run `./gradlew build`
#Using cloud foundry to deploy this project:

see the overall tutorial on 
https://cloud.ibm.com/docs/openwhisk?topic=cloud-functions-creating-java-actions

`ibmcloud api https://api.ng.bluemix.net`

`ibmcloud login -o <cloud foundry org, most likely your user name> -s <space, most likely dev> -sso`

`ibmcloud cf --target`

`ibmcloud fn action update helloJava build/libs/gol-cloud-function-0.0.1.jar --main Hello`



