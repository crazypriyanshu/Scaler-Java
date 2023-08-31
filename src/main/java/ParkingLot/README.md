Q1. One parameter or many parameters?

Ans1. One request dto (which has all inputs as fields inside it)

Q2. Instead of DTO can't we use models for input in controllers?

Ans2.

2.1 Necessary Information => No model has all 3 inputs together

2.2 Sufficient Information => Models which have extra information will confuse the client while making a request

2.3 Models have a single responsibility of representing schema of problem

Q3. Instead of DTO can't we use models for output in controllers?

Ans3. No, the reasons are same as Q2. Also, ResponseDTO help us give better response in case of an exception

Q4. Should we pass requestDTO to service? Ans4. No, because same service might be used by multiple controllers and every
controller's method has their own pair of request-response dto So, service should be free to be used by any controller and hence will not be bound to request dto of a specific controller

Models are deriving all classes from Base model and have getters and setters


Our backend should never have an unhandled exception - > 

Controller is closest to client
Controllers wraps the whole application
Controllers should always handle the exception - 
controllers is the last layer to handle the exception.
Controller should have only one parameter only , hence we create GenerateTicketRequestDTO class
This creates the object needed for controller

Should we pass RequestDTO to service ?
No. because same service can be used by many controllers
