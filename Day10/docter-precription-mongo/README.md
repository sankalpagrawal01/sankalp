# Build
mvn clean install
# Run
docker-compose -f docker-compose-mongo.yml up -d
mvn spring-boot:run
docker-compose -f docker-compose-mongo.yml down
# training
## Post

curl -X POST http://localhost:8083/customer/create -H 'content-type: application/json' -d '{"prescriptionId":"pres1", "appointmentId":"101", "description":"blood test", "patientName":"patient1", "doctorName":"Doc1"}'
## Get 

curl -X GET http://localhost:8083/customer/read 

## Put

curl -X PUT http://localhost:8083/customer/update?custId=1re07&name=patient1 

##Delete

curl -X DELETE http://localhost:8083/customer/delete?name=patient1


#Show data::

docker exec -it <id> docter-precription-mongo_mongo_1 bash

mongo

show dbs

use test_db

show tables

db.customer.find()

# swagger 

http://localhost:8083/swagger-ui.html