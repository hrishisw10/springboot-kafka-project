# springboot-kafka-project

This maven projects consists of two sub modules/microservices.

One of the service reads data of WIKIMEDIA recent changes and writes it to kafka.
Second microservices consumes this data from beginning, processes it and saves to database;
