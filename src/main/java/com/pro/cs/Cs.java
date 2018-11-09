package com.pro.cs;

import com.pro.tool.util.ToolUtil;

public class Cs {

  public static void main(String[] args) {
//    String s = "name";
//    char[] c = s.trim().toCharArray();
//    StringBuilder initialCaseColumnName = new StringBuilder();
//    StringBuilder initialLowercaseColumnName = new StringBuilder();
//    StringBuilder columnName = new StringBuilder();
//    boolean isf = true;
//    for(char cc : c){
//      if (isf) {
//        isf = false;
//        initialCaseColumnName.append(Character.toUpperCase(cc));
//        initialLowercaseColumnName.append(Character.toLowerCase(cc));
//        columnName.append(Character.toUpperCase(cc));
//      } else {
//        if (Character.isUpperCase(cc)) {
//          initialCaseColumnName.append(cc);
//          initialLowercaseColumnName.append(cc);
//          columnName.append("_").append(Character.toUpperCase(cc));
//        } else {
//          initialCaseColumnName.append(cc);
//          initialLowercaseColumnName.append(cc);
//          columnName.append(Character.toUpperCase(cc));
//        }
//      }
//    }
//    System.out.println(initialCaseColumnName.toString());
//    System.out.println(initialLowercaseColumnName.toString());
//    System.out.println(columnName.toString());
    
//    String s = "jdbc:mysql://localhost:3306/wodecoding?useUnicode=yes&characterEncoding=utf8&useSSL=false";
//    if (s.indexOf("jdbc:mysql://") != -1) {
//      s = s.trim().replaceAll("jdbc:mysql://", "");
//      if (s.indexOf("/") != -1) {
//        s = s.substring(s.indexOf("/") + 1);
//        if (s.indexOf("?") != -1) {
//          s = s.substring(0, s.indexOf("?"));
//        }
//      }
//    }
//    System.out.println(s);
    
//    StringBuilder s = new StringBuilder("qwe\nasd,\n");
//    s.delete(s.length() - 2, s.length());
//    System.out.println(s.toString());
    
//    StrTools.getFileFromContentStrAndPath("/target/\n" + 
//        "\n" + 
//        "### STS ###\n" + 
//        ".apt_generated\n" + 
//        ".classpath\n" + 
//        ".factorypath\n" + 
//        ".project\n" + 
//        ".settings\n" + 
//        ".springBeans\n" + 
//        ".sts4-cache\n" + 
//        "/bin/\n" + 
//        "\n" + 
//        "### IntelliJ IDEA ###\n" + 
//        ".idea\n" + 
//        "*.iws\n" + 
//        "*.iml\n" + 
//        "*.ipr\n" + 
//        "\n" + 
//        "### NetBeans ###\n" + 
//        "/nbproject/private/\n" + 
//        "/build/\n" + 
//        "/nbbuild/\n" + 
//        "/dist/\n" + 
//        "/nbdist/\n" + 
//        "/.nb-gradle/\n" + 
//        "\n" + 
//        "# Compiled class file\n" + 
//        "*.class\n" + 
//        "\n" + 
//        "# Log file\n" + 
//        "*.log\n" + 
//        "\n" + 
//        "# BlueJ files\n" + 
//        "*.ctxt\n" + 
//        "\n" + 
//        "# Mobile Tools for Java (J2ME)\n" + 
//        ".mtj.tmp/\n" + 
//        "\n" + 
//        "# Package Files #\n" + 
//        "*.jar\n" + 
//        "*.war\n" + 
//        "*.nar\n" + 
//        "*.ear\n" + 
//        "*.zip\n" + 
//        "*.tar.gz\n" + 
//        "*.rar\n" + 
//        "\n" + 
//        "# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml\n" + 
//        "hs_err_pid*\n" + 
//        "\n" + 
//        "pom.xml.tag\n" + 
//        ".xml.releaseBackup\n" + 
//        "pom.xml.versionsBackup\n" + 
//        "pom.xml.next\n" + 
//        "release.properties\n" + 
//        "dependency-reduced-pom.xml\n" + 
//        "buildNumber.properties\n" + 
//        ".mvn/timing.properties\n" + 
//        "\n" + 
//        ".DS_Store\n" + 
//        "", "/Users/moonnow/wode/cs/empire/3/code-plugin/sql/.gitignore");
    
//    System.out.println(System.currentTimeMillis());
    System.out.println(ToolUtil.getUUID());
  }

}
