
# Assignment #1 - Heartbeat Tactic

Group Members:
- Henry Keena
- Gavin Burris
- Prateek Narayanan

Our assignment does not use any external frameworks or dependencies. It runs on pure Java 8.

To run our program you need only use the 'compile.sh' script in the root directory of the project.

Alternatively you can run the project by compiling and running the 'CarHeartBeatMain.java' file.

Our project is meant to be a representation of a potential Navigation System Monitor process that monitors the GPS and Navigation systems.

It achieves this through some fun multithreading solutions. 

It will run infinitely by starting a navigation/gps process thread, and will monitor this thread until it randomly ends or crashes, then it will start a new one and continue the process until you manually kill/terminate the whole system.

While a somewhat crude implementation, it clearly demonstrates the Heartbeat Tactic in monitoring different processes.

Link to GitHub Repository: https://github.com/gb9951/CarHeartBeat