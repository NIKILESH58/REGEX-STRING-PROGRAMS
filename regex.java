{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
import java.util.regex.Pattern;\
import java.util.regex.Matcher;\
public class regex\
\{\
   public static void inttochar()\
   \{\
       String a ="a3b24a123s1";\
       String b ="[0-9][0-9]*";\
       String output="";\
       int c=0;\
       Pattern p = Pattern.compile(b);\
       Matcher m = p.matcher(a);\
       while(m.find())\
       \{\
           for(int i=1;i<=Integer.parseInt(m.group());i++)\
           \{\
               output+=a.charAt(c);\
           \}\
           c=m.end();\
       \}\
       System.out.println(output);\
   \}\
   public static void chartoint()\
   \{\
       String a ="aaabbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";\
       String b ="([a-z])\\\\1*";\
       String output="";\
       int length=0,c=0;\
       Pattern p = Pattern.compile(b);\
       Matcher m = p.matcher(a);\
       while(m.find())\
       \{\
           length = m.group().length();\
           output+=(length+"")+m.group().charAt(0);\
                  System.out.println(output);\
       \}\
   \}\
   public static void main(String args[])\
   \{\
       System.out.println("JAVA STRING PROGRAMS USING REGEX FUNCTIONS");\
       chartoint();\
       inttochar();\
   \}\
\}\
}