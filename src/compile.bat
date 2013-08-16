del MANIFEST.MF DD.jar jars\DD.jar widgets\updates\*.class widgets\dir_management\*.class widgets\dir_fw_terms\*.class widgets\updatesKeys\*.class WSupdate\*.class updates\*.class config\*.class plugin_data\*.class streaming\*.class simulator\*.class handling_wb\*.class hds\*.class util\*.class ASN1\*.class wireless\*.class widgets\peers\*.class widgets\identities\*.class widgets\constituent\*.class widgets\wireless\*.class widgets\components\*.class widgets\org\*.class widgets\motions\*.class widgets\justifications\*.class widgets\news\*.class widgets\directories\*.class table\*.class data\*.class ciphersuits\*.class WSupdate\*.class  updates\*.class census\*.class registration\*.class

javac -cp  "./jars/MultiSplit.jar;./jars/sqlite4java.jar;./jars/sqlite-jdbc-3.7.2.jar;jars/icepdf-viewer.jar;jars/icepdf-core.jar;jars/MetaphaseEditor-1.0.0.jar;./" updates\*.java widgets\dir_management\*.java widgets\dir_fw_terms\*.java widgets\updates\*.java widgets\updatesKeys\*.java WSupdate\*.java config\*.java plugin_data\*.java streaming\*.java simulator\*.java handling_wb\*.java hds\*.java util\*.java ASN1\*.java wireless\*.java widgets\*.java widgets\peers\*.java widgets\identities\*.java widgets\constituent\*.java widgets\wireless\*.java widgets\components\*.java widgets\org\*.java widgets\motions\*.java widgets\justifications\*.java widgets\news\*.java widgets\directories\*.java table\*.java data\*.java ciphersuits\*.java WSupdate\*.java  updates\*.java census\*.java registration\*.java

echo Main-Class: config.DD> MANIFEST.MF
@del DD.jar

jar cmf MANIFEST.MF DD.jar p2pdd_resources updates\*.class widgets\dir_management\*.class widgets\dir_fw_terms\*.class widgets\updates\*.class widgets\updatesKeys\*.class WSupdate\*.class config\*.class plugin_data\*.class streaming\*.class simulator\*.class handling_wb\*.class hds\*.class util\*.class ASN1\*.class wireless\*.class widgets\peers\*.class widgets\identities\*.class widgets\constituent\*.class widgets\wireless\*.class widgets\components\*.class widgets\org\*.class widgets\motions\*.class widgets\justifications\*.class widgets\news\*.class widgets\directories\*.class table\*.class data\*.class ciphersuits\*.class WSupdate\*.class  updates\*.class census\*.class registration\*.class *.properties
mkdir jars
copy DD.jar jars\
copy /b dd_run_stub.bat + DD.jar dd_DD.bat

