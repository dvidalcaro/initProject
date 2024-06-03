#InitProject helps us create a project structure depending on the topics to be managed in the project.
# Initialize your project according to the following folder structure by file
type, module-based or by functionality
  -a, --archive       Create the project for Archive
  -c, --create=name   Create the project folder structures
  -f, --functions     Create the project for functionality
  -h, --help          Show this help message and exit.
  -m, --modules       Create the project for modules
  -V, --version       Print version information and exit.
#Create the project for Archive
-create shop -archive
-c shop -a 
#Create the project for modules
--create shop --modules
-c shop -m
#Create the project for functionality
--create shop --functions
-c shop -f
