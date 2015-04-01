
echo "view list of jvm processes"
jps
jps -m #see argument to main()
jps -v #see argument to JVM
jps -l #see full package name


echo "view thread dump of jvm processes."
echo " include live stacktrace."
javaproc_pid=3278
jstack -l $javaproc_pid

jdb -classpath . $mainclass $argument
# inside jdb, use commands:
## stop in class.method
## stop at class:linenumber
## run
## step #step into the method
## next
## where #stack frames in current thread
## where all # ... in all threads
## print var
## list # see source code where current program is suspended
## threads # see all threads (with id) running in tne system
## suspend 0x01 # suspend thread with id 0x01
## resume 0x01

file_stdout_redirected=/tmp/stdout_redirected_tt
ant debug 1>$file_stdout_redirected
