#Setting up a JDK for Windows/x64

Let us download the Windows version. What you get is a ZIP file of about 200MB that you can open with any ZIP utility software. This ZIP file contains the JDK. You can unzip the content of this file anywhere on your computer.

Once this is done you need to create an environment variable called JAVA_HOME that points to the directory where you unzipped the JDK. First you need to open a DOS prompt. If you unzipped a JDK 16 ZIP file in the D:\jdk\ directory then the command you need to type in this DOS prompt is the following:

> set JAVA_HOME=D:\jdk\jdk-16

Please note that in this example and all the others the leading > is there to show you that you need to type this command or paste it in a prompt. You should not type this character or paste it as it is not part of the set command.

You can check that the JAVA_HOME variable has been properly set by typing the following code:

> echo %JAVA_HOME%

This command should print the following:

D:\jdk\jdk-16

You then need to update your PATH environment variable to add the bin directory of your JDK directory to it. This can be done with the following command:

> set PATH=%JAVA_HOME%\bin;%PATH%

You need to be very cautious while setting up these two variables, because a single mistake like an added white space of a missing semicolon will result in failure.

Do not close this command prompt. If you close it and open it again then you will need to create these two variables again. 

#Resources



#CLI
java projects\src\main\java\com\example\MyOnboardingClass>  java -version
java version "17.0.1" 2021-10-19 LTS
java projects\src\main\java\com\example\MyOnboardingClass> javac MyOnboardingClass.java
java projects\src\main\java\com\example\MyOnboardingClass> java MyOnboardingClass.java
Hello patience


