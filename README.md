# Documentation PL-project-String
Description: This simple code allow users to generate code with their requirements (lowercase, uppercase letters, symbols, numbers, user’s character set).  Firstly, code gets minimum and maximum length of the password, from user, after gets information about requirements for the password, answering to the questions  (‘1’ if yes, ‘0’ if no). In case user wants to enter own set of characters, there’s a condition for to get the line. 

We have four set of characters (five if user added) and if each certain variable is true (1), we have StringBuilder for to contain these sets. Then, the program generates a random password based on the user's choices. It calculates the random length of the password, choosing a value between the minimum and maximum lengths the user entered. After that, the password is built by randomly picking characters from the character sets the user selected (lowercase letters, uppercase letters, numbers, symbols, or a custom set if the user provided one). These characters are added to the password using StringBuilder. 

After the password is generated, the program checks the password's strength. It checks if the password meets certain conditions, like the length of the password, whether it has at least one lowercase letter, one uppercase letter, one number, and one symbol. Based on how many of these conditions the password meets, it is classified as "weak," "moderate," or "strong." 

Finally, the program shows the generated password and the strength result to the user. It also suggests that the user can run the program again to generate a new password if needed. 

 
Algorithms: The program creates a random password by choosing a length between the minimum and maximum values the user entered. Then, it picks random characters from the selected sets (lowercase, uppercase, numbers, symbols, or a custom set). After the password is created, the program checks if it has the right length, lowercase letters, uppercase letters, numbers, and symbols. Based on this, it labels the password as "weak," "moderate," or "strong." 

Input file: I’ve tried to input txt file, and run with together with code, but there were some issues again and couldn’t do that. 

Improvements: Code meets the requirements of the project description, but there’s actually some flaws. User can input maximum size less than it should be, according to chosen sets. For example, maximum size is 3, but the user answered 1 (which means ‘yes, include this set of characters) for 5 questions, it would be impossible to include every chosen requirement, they are five, but there are only three places. 

Also, if you want to enter your own set of characters, you shouldn’t use space between them, because randomizer might use this space. And it would be illogic if it was answered no to the question about if the user wants to include uppercase letters and after included uppercase letters in his own set of characters, same with other sets. 

For to improve this code we might to solve these issues. Also, there might be a String or array of Strings of users, and randomizer will use them in generating, because it’s easier not to forget a password which makes sense.  Case where user refuse from all sets also should be considered. 

Challenges: Couldn’t to run with input file.  Documenting project with so many requirements took quite amount of time. I had to do a project in limited time, as soon as possible, so it isn’t as good as the first two projects, also time limit is a reason why I decided to choose the easiest one. 
