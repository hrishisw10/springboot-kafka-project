# springboot-kafka-project

This maven projects consisths of two sub modules/microservices.

One of the service reads data from <h4>wikimedia</h4> recent changes an writes it to kafka.
Second microservices consumes this data from beginning and after processing it, saves to database;
