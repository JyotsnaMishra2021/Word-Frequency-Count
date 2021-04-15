Wordcount
Requirement:
-  Determine frequency of word occurrence in  text File
- Determine similar words in text File
Prerequisite:
-	Eclipse Ide and JDK 1.8
How to deploy:
•	Checkout /download the project and extract in your local system.
•	Open eclipse IDE and create new workspace
•	Import this project as “Existing Maven Project” in eclipse IDE.
•	to kill the process if port is already in use taskkill /f /pid <process id>
•	Run as Maven build .
•	Run project as Java Application ,select WordCountApplication.java Class
•	Open Browser and hit the uri http://localhost:8080/wordCount.html 
•	Select Text file in which you want to find word occurrence 
•	Enter word that you want to search in a file
UI snapshot:

 
Sample Output in Json format:

 {"wordCount":2,"similarDataType":"Words,Wor,word ","inputWord":"Word"}

Testing :
For unit testing click on project and run as Junit Test.
 
