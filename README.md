For this project you need to do some steps:

1. Just run this spring boot application.
2. Go to H2 database url to check that it's up or not<br>
   
   http://localhost:8085/h2-console<br>
   jdbc url = jdbc:h2:./quizdb<br>
   username = sa<br>
   password = password<br>
   
3. Now you can create new data in database via API's

4. just hit create todo API<br>
    localhost:8085/quizapp/addTodo
    sample json:
    
    {
        "id": 4,
        "todoName": "Dze",
        "description": "An event is going to held by this Afternoon",
        "time": 1560503318000
    }
5. Now you can hit all API's
      <-- Get all Todos -->
   -- localhost:8085/quizapp/getAllTodos
      
      <-- Update a Todo --> 
   -- localhost:8085/quizapp/updateTodo
    sample json for update Todo
     {
     	"id":4,
     	"todoName":"ABCD",
     	"description":"An test is going to held by yesterday",
     	"time":1560503318000
     }
     
     <-- Delete multiple todos -->
   -- localhost:8085/quizapp/deleteMultipleTodos
     sample json for this api
       [2,3]
   
     <-- Delete single todo -->
   -- localhost:8085/quizapp/deleteTodo/1   
        
    
   
   

      