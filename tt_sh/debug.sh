
echo "view list of jvm processes"
jps

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

file_stdout_redirected=/tmp/stdout_redirected_tt
ant debug 1>$file_stdout_redirected
