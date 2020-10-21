node
{
stage 'Run JMter Test'
sh /home/prajwal/Documents/apache-jmeter-5.3/bin/jmeter.sh -n -t /home/prajwal/Documents/mytest.jmx -l /home/prajwal/Documents/mytest_jenkins_git1.jtl
}
