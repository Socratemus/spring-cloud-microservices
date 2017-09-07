1. DOCKER
 - docker-compose create (download images!)
 - docker-compose up // download and starts
 - docker-compose ps // see current images

2. Authentication Service:: (auth module)

- create jks file with the following command:
 `keytool -genkeypair -alias jwt -keyalg RSA -dname "CN=microservice, L=Bucuresti, c=RO" -keypass MY_SECRET_KEY -keystore jwd.jks -storepass MY_SECRET_KEY`
- get private and public key from the newly generated pair 
 `keytool -list -rfc --keystore jwd.jks | openssl x509 -inform pem -pubkey`

- post request in order to get the JWT token
 `curl -X POST "web_app:web_pass@localhost:9999/oauth/token" -d "grant_type=password&username=reader&password=password" `

3. Inventory
...

4. Store
...

5. Checkout
...


! Resources:
Bluemix, Heroku, Jenkins, Bamboo

Create docker image
`mvn clean package docker:build -DbuildNumber=1 -DskipTests`

See current images
`docker images | grep academy` : 

Push docker image to docker.io repo
`docker push **esolutionsacademy/auth-cornel**`
