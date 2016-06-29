# sqlplus

[![Build Status](https://travis-ci.org/mijecu25/sqlplus.svg?branch=develop)](https://travis-ci.org/mijecu25/sqlplus)
[![Coverage Status](https://coveralls.io/repos/github/mijecu25/sqlplus/badge.svg?branch=develop)](https://coveralls.io/github/mijecu25/sqlplus?branch=develop)
[![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/mijecu25/sqlplus/develop/LICENSE)

A DSL to add alerts to various SQL DML events. SQLPlus currently works with MySQL server.

## Installation

The easiest way to install sqlplus is to download the jar file from our [website](http://www.mijecu25.com/software/sqlplus/).

If you want to download, customize, buidl from source, there are extra steps that need to be taken:

1. Install Java for your operation system. SQLPlus was developed and tested using Java 1.8.0_65.

2. Install Maven for your operation system. SQLPlus was developed and tested using Apache Maven 3.3.9.

3. (For developing and modifying) Download ANTLR v3.5.2 and save it in a directory. SQLPlus was developed and tested using [antlr-3.5.2-complete-no-st3.jar](http://www.antlr3.org/download/antlr-3.5.2-complete-no-st3.jar).

4. (For developing and modifying) Add ANTLR to your `classpath` environmental variable:	

		$ export CLASSPATH=$CLASSPATH:{PATH-TO-ANTLR-JAR}/antlr-3.5.2-complete-no-st3.jar
		
5. Clone the repo from [GitHub](https://github.com/mijecu25/sqlplus):

        $ git clone https://github.com/mijecu25/sqlplus.git
        $ cd ./sqlplus
        
6. The project has a Makefile with several targets that will allow you to develop and build SQLPlus. The most likely you want to use to build the project is 
        
        $ make package
    This target uses Maven to package the project, while skipping the JUnit tests, to build a jar file called ```sqlplus-{VERSION}-complete.jar```. You are welcome to execute the test cases. However, some of them might not work because they were using commands specific to the setup and configurations of the MySQL server of the developers.

7. Execute SQLPlus! 
        
        $ java -cp "{PATH-TO-COMPLETE-SQLPLUS-JAR}/sqlplus-{VERSION}-complete.jar:$CLASSPATH" com.mijecu25.sqlplus.SQLPlus
        Welcome to SQLPlus! This program has a DSL to add alerts to various SQL DML events.
        ...
    It is a good idea to create an alias of the above command in your ```.bash_profile``` or similar startup script to avoid writting a long command. 

        $ alias sqlplus= 'java -cp "{PATH-TO-COMPLETE-SQLPLUS-JAR}/sqlplus-{VERSION}-complete.jar:$CLASSPATH" com.mijecu25.sqlplus.SQLPlus'
    Be sure to reload the script before using the alias. Once you have done the above, you can run SQLPlus like this:
    
        $ sqlplus
        Welcome to SQLPlus! This program has a DSL to add alerts to various SQL DML events.
        ...
    
## License

The MIT License (MIT)

Copyright (c) 2016 Miguel Velez

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
