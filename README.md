# idearefinery_project
To Run: 
1.)cd into idearefinery
2.) use command mvn clean install 
3.) cd into target 
4.) java -jar idearefinery-0.0.1-SNAPSHOT.jar
To Use:
- There is a json collection called "Idea_Refinery.postman_collection.json" to hit all 4 API
- port will be 8090
    - Get call: http://localhost:8090/api/task/getAll
    - Get call: http://localhost:8090/api/task/get/3
    - POST call: http://localhost:8090/api/task/add
      - Requestbody:
          -   {
                "title": "idearefinery part 5",
                "description": "the five task",
                "completed": "true",
                "createdDate": "2023-03-12",
                "completedDate": "2024-10-01"
            }
    - PUT call: http://localhost:8090/api/task/update/1
       - Requestbody:
          -   {
                "title": "idearefinery part 5",
                "description": "the five task",
                "completed": "true",
                "createdDate": "2023-03-12",
                "completedDate": "2024-10-01"
             }
Check H2 Database with url: http://localhost:8090/h2-console/
username and password are in the properties file
