import java.io.*;
class table
{
public static void main(String arg[])throws Exception
{
DataInputStream in=new DataInputStream(System.in);
String a1[]=new String[8]; 
String a2[]=new String[8]; 
String a3[]=new String[8];
String a4[]=new String[8];
String a5[]=new String[8];
String a6[]=new String[8];
String b1[]=new String[8];
String b2[]=new String[8]; 
String b3[]=new String[8];
String b4[]=new String[8]; 
String b5[]=new String[8]; 
String b6[]=new String[8];    
String c1[]=new String[8]; 
String c2[]=new String[8]; 
String c3[]=new String[8]; 
String c4[]=new String[8];
String c5[]=new String[8]; 
String c6[]=new String[8];
String d1[]=new String[8]; 
String d2[]=new String[8]; 
String d3[]=new String[8]; 
String d4[]=new String[8];
String d5[]=new String[8]; 
String d6[]=new String[8];
String e1[]=new String[8]; 
String e2[]=new String[8]; 
String e3[]=new String[8]; 
String e4[]=new String[8];
String e5[]=new String[8]; 
String e6[]=new String[8];

String ta1[]=new String[8];
String ta2[]=new String[8]; 
String ta3[]=new String[8];  
String ta4[]=new String[8];
String ta5[]=new String[8];
String ta6[]=new String[8];
String tb1[]=new String[8];
String tb2[]=new String[8];
String tb3[]=new String[8];
String tb4[]=new String[8];
String tb5[]=new String[8];
String tb6[]=new String[8];
String tc1[]=new String[8];
String tc2[]=new String[8];
String tc3[]=new String[8];
String tc4[]=new String[8];
String tc5[]=new String[8];
String tc6[]=new String[8];
String td1[]=new String[8];
String td2[]=new String[8];
String td3[]=new String[8];
String td4[]=new String[8];
String td5[]=new String[8];
String td6[]=new String[8];
String te1[]=new String[8];
String te2[]=new String[8];
String te3[]=new String[8];
String te4[]=new String[8]; 
String te5[]=new String[8];
String te6[]=new String[8];
String tf1[]=new String[8];
String tf2[]=new String[8];
String tf3[]=new String[8];
String tf4[]=new String[8]; 
String tf5[]=new String[8];
String tf6[]=new String[8];
String tg1[]=new String[8];
String tg2[]=new String[8];
String tg3[]=new String[8];
String tg4[]=new String[8]; 
String tg5[]=new String[8];
String tg6[]=new String[8];


int ch,i,m;
int p1,p2,p3,p4,p5,j4,j5,j1,j2,j3;

int ctr1=0,ctr2=0,ctr3=0,ctr4=0,ctr5=0,ctr6=0;
int ct1=0,ct2=0,ct3=0,ct4=0,ct5=0,ct6=0;

int cc1=0,cc2=0,cc3=0,cc4=0,cc5=0,cc6=0;
int ctc1=0,ctc2=0,ctc3=0,ctc4=0,ctc5=0,ctc6=0;

int t1=0,t2=0,t3=0,t4=0,t5=0,t6=0;
int o1=0,o2=0,o3=0,o4=0,o5=0,o6=0;
int x1=0,x2=0,x3=0,x4=0,x5=0,x6=0;

int g=0;
String s1="",s="";

for(i=0;i<8;i++)
{

a1[i]="";
a2[i]="";
a3[i]="";
a4[i]="";
a5[i]="";
a6[i]="";


b1[i]="";
b2[i]="";
b3[i]="";
b4[i]="";
b5[i]="";
b6[i]="";


c1[i]="";
c2[i]="";
c3[i]="";
c4[i]="";
c5[i]="";
c6[i]="";

d1[i]="";
d2[i]="";
d3[i]="";
d4[i]="";
d5[i]="";
d6[i]="";

e1[i]="";
e2[i]="";
e3[i]="";
e4[i]="";
e5[i]="";
e6[i]="";

ta1[i]="";
ta2[i]="";
ta3[i]="";
ta4[i]="";
ta5[i]="";
ta6[i]="";

tb1[i]="";
tb2[i]="";
tb3[i]="";
tb4[i]="";
tb5[i]="";
tb6[i]="";

tc1[i]="";
tc2[i]="";
tc3[i]="";
tc4[i]="";
tc5[i]="";
tc6[i]="";

td1[i]="";
td2[i]="";
td3[i]="";
td4[i]="";
td5[i]="";
td6[i]="";

te1[i]="";
te2[i]="";
te3[i]="";
te4[i]="";
te5[i]="";
te6[i]="";

tf1[i]="";
tf2[i]="";
tf3[i]="";
tf4[i]="";
tf5[i]="";
tf6[i]="";

tg1[i]="";
tg2[i]="";
tg3[i]="";
tg4[i]="";
tg5[i]="";
tg6[i]="";
}

System.out.println("Enter THE CHOICE AS:\n1:FOR TIME TABLE OF CLASS 1 TO 5\n2:FOR TIME TABLE OF CLASS 6 TO 10");
int choice=Integer.parseInt(in.readLine());

String tt1,tt2,tt3,tt4,tt5,tt6,tt7;
System.out.println("PLEASE Enter:\nTHE SEVEN REQUIRED TEACHERS NAME");
tt1=in.readLine();
tt2=in.readLine();
tt3=in.readLine();
tt4=in.readLine();
tt5=in.readLine();
tt6=in.readLine();
tt7=in.readLine();

String ss;

while(true)
{ 
System.out.println("PLEASE Enter YOUR CHOICE");
System.out.println("PLEASE Enter:AS\n1:FOR\t"+tt1+"\n2:FOR\t"+tt2+"\n3:FOR\t"+tt3+"\n4:FOR\t"+tt4+"\n5:FOR\t"+tt5+"\n6:FOR\t"+tt6+"\n7:FOR\t"+tt7);
ch=Integer.parseInt(in.readLine());

if(ch==1)
{
System.out.println("Enter the class which you want to give to "+tt1);
m=Integer.parseInt(in.readLine());
if(m==1||m==6)
{
System.out.println("How many periods do you want "+tt1+" to give in this class");
p1=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt1+" IN THIS CLASS");
ss=in.readLine();

while(p1>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=a1[i];
s1=ta1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctr1<6))
{
a1[i]=ss;
ta1[i]="1";
ctr1++;
p1--;ff=1;g=0;
break;
}
}


if(p1>0)
{
for(i=0;i<8;i++)
{
s=a2[i];
s1=ta2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctr2<6))
{
a2[i]=ss;
ta2[i]="1";
ctr2++;
p1--;ff=1;g=0;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a3[i];
s1=ta3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(ctr3<6))
{
a3[i]=ss;
ta3[i]="1";
ctr3++;g=0;ff=1;
p1--;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a4[i];
s1=ta4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(ctr4<6))
{
a4[i]=ss;
ta4[i]="1";
ctr4++;g=0;ff=1;
p1--;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a5[i];
s1=ta5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(ctr5<6))
{
a5[i]=ss;
ta5[i]="1";
ctr5++;
p1--;g=0;ff=1;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a6[i];
s1=ta6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctr6<6))
{
a6[i]=ss;
ta6[i]="1";
ctr6++;g=0;ff=1;
p1--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==2||m==7)
{
System.out.println("How many periods do you want "+tt1+" to give in this class");
p2=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt1+" IN THIS CLASS");
ss=in.readLine();

while(p2>0)
{
int ff=0;
for(i=0;i<8;i++)
{

s=b1[i];
s1=ta1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctr1<6))
{
b1[i]=ss;
ta1[i]="2";
ctr1++;
p2--;ff=1;g=0;
break;
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{

s=b2[i];
s1=ta2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctr2<6))
{
b2[i]=ss;
ta2[i]="2";
ctr2++;g=0;ff=1;
p2--;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{
s=b3[i];
s1=ta3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctr3<6))
{
b3[i]=ss;
ta3[i]="2";
ctr3++;g=0;ff=1;
p2--;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{

s=a4[i];
s1=ta4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctr4<6))
{
b4[i]=ss;
ta4[i]="2";
ctr4++;g=0;ff=1;
p2--;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{

s=a5[i];
s1=ta5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctr5<6))
{
b5[i]=ss;
ta5[i]="2";
ctr5++;g=0;ff=1;
p2--;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{
s=b6[i];
s1=ta6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctr6<6))
{
b6[i]=ss;
ta6[i]="2";
ctr6++;g=0;ff=1;
p2--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==3||m==8)
{
System.out.println("How many periods do you want "+tt1+" to give in this class");
p3=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt1+" IN THIS CLASS");
ss=in.readLine();


while(p3>0)
{
int ff=0;
for(i=0;i<8;i++)
{

s=c1[i];
s1=ta1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctr1<6))
{
c1[i]=ss;
ta1[i]="3";
ctr1++;g=0;ff=1;
p3--;
break;
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{

s=c2[i];
s1=ta2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctr2<6))
{
c2[i]=ss;
ta2[i]="3";
ctr2++;g=0;ff=1;
p3--;
break;
}
}
}


if(p3>0)
{
for(i=0;i<8;i++)
{

s=c3[i];
s1=ta3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctr3<6))
{
c3[i]=ss;
ta3[i]="3";
ctr3++;g=0;ff=1;
p3--;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{

s=c4[i];
s1=ta4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctr4<6))
{
c4[i]=ss;
ta4[i]="3";
ctr4++;g=0;ff=1;
p3--;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{

s=c5[i];
s1=ta5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctr5<6))
{
c5[i]=ss;
ta5[i]="3";
ctr5++;g=0;ff=1;
p3--;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{

s=c6[i];
s1=ta6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctr6<6))
{
c6[i]=ss;
ta6[i]="3";
ctr6++;
p3--;g=0;ff=1;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}


if(m==4||m==9)
{
System.out.println("How many periods do you want "+tt1+" to give in this class");
p4=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt1+" IN THIS CLASS");
ss=in.readLine();

while(p4>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=d1[i];
s1=ta1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctr1<6))
{
d1[i]=ss;
ta1[i]="4";
ctr1++;
p4--;ff=1;g=0;
break;
}
}


if(p4>0)
{
for(i=0;i<8;i++)
{
s=d2[i];
s1=ta2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctr2<6))
{
d2[i]=ss;
ta2[i]="4";
ctr2++;
p4--;ff=1;g=0;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d3[i];
s1=ta3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(ctr3<6))
{
d3[i]=ss;
ta3[i]="4";
ctr3++;g=0;ff=1;
p4--;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d4[i];
s1=ta4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(ctr4<6))
{
d4[i]=ss;
ta4[i]="4";
ctr4++;g=0;ff=1;
p4--;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d5[i];
s1=ta5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(ctr5<6))
{
d5[i]=ss;
ta5[i]="4";
ctr5++;
p4--;g=0;ff=1;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d6[i];
s1=ta6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctr6<6))
{
d6[i]=ss;
ta6[i]="4";
ctr6++;g=0;ff=1;
p4--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==5||m==10)
{
System.out.println("How many periods do you want "+tt1+" to give in this class");
p5=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt1+" IN THIS CLASS");
ss=in.readLine();

while(p5>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=e1[i];
s1=ta1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctr1<6))
{
e1[i]=ss;
ta1[i]="5";
ctr1++;
p5--;ff=1;g=0;
break;
}
}


if(p5>0)
{
for(i=0;i<8;i++)
{
s=e2[i];
s1=ta2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctr2<6))
{
e2[i]=ss;
ta2[i]="5";
ctr2++;
p5--;ff=1;g=0;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e3[i];
s1=ta3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(ctr3<6))
{
e3[i]=ss;
ta3[i]="5";
ctr3++;g=0;ff=1;
p5--;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e4[i];
s1=ta4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(ctr4<6))
{
e4[i]=ss;
ta4[i]="5";
ctr4++;g=0;ff=1;
p5--;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e5[i];
s1=ta5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(ctr5<6))
{
e5[i]=ss;
ta5[i]="5";
ctr5++;
p5--;g=0;ff=1;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e6[i];
s1=ta6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctr6<6))
{
e6[i]=ss;
ta6[i]="5";
ctr6++;g=0;ff=1;
p5--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

}

if(ch==2)
{
System.out.println("Enter the class which you want to give to "+tt2);
m=Integer.parseInt(in.readLine());
if(m==1||m==6)
{
System.out.println("How many periods do you want "+tt2+" to give in this class");
j1=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt2+" IN THIS CLASS");
ss=in.readLine();


while(j1>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=a1[i];
s1=tb1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct1<6))
{
a1[i]=ss;
tb1[i]="1";
ct1++;g=0;ff=1;
j1--;
break;
}
}


if(j1>0)
{
for(i=0;i<8;i++)
{
s=a2[i];
s1=tb2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct2<6))
{
a2[i]=ss;
tb2[i]="1";
ct2++;g=0;ff=1;
j1--;
break;
}
}
}

if(j1>0)
{

for(i=0;i<8;i++)
{
s=a3[i];
s1=tb3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct3<6))
{
a3[i]=ss;
tb3[i]="1";
ct3++;g=0;ff=1;
j1--;
break;
}
}
}

if(j1>0)
{
for(i=0;i<8;i++)
{
s=a4[i];
s1=tb4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ct4<6))
{
a4[i]=ss;
tb4[i]="1";
ct4++;g=0;ff=1;
j1--;
break;
}
}
}

if(j1>0)
{
for(i=0;i<8;i++)
{
s=a5[i];
s1=tb5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct5<6))
{
a5[i]=ss;
tb5[i]="1";
ct5++;g=0;ff=1;
j1--;
break;
}
}
}

if(j1>0)
{
for(i=0;i<8;i++)
{
s=a6[i];
s1=tb6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct6<6))
{
a6[i]=ss;
tb6[i]="1";
ct6++;g=0;ff=1;
j1--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==2||m==7)
{
System.out.println("How many periods do you want "+tt2+" to give in this class");
j2=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt2+" IN THIS CLASS");
ss=in.readLine();

while(j2>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=b1[i];
s1=tb1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct1<6))
{
b1[i]=ss;
tb1[i]="2";
ct1++;g=0;ff=1;
j2--;
break;
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b2[i];
s1=tb2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct2<6))
{
b2[i]=ss;
tb2[i]="2";
ct2++;g=0;ff=1;
j2--;
break;
}
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b3[i];
s1=tb3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct3<6))
{
b3[i]=ss;
tb3[i]="2";
ct3++;g=0;ff=1;
j2--;
break;
}
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b4[i];
s1=tb4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct4<6))
{
b4[i]=ss;
tb4[i]="2";
ct4++;g=0;ff=1;
j2--;
break;
}
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b5[i];
s1=tb5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct5<6))
{
b5[i]=ss;
tb5[i]="2";
ct5++;g=0;ff=1;
j2--;
break;
}
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b6[i];
s1=tb6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct6<6))
{
b6[i]=ss;
tb6[i]="2";
ct6++;g=0;ff=1;
j2--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==3||m==8)
{
System.out.println("How many periods do you want "+tt2+" to give in this class");
j3=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt2+" IN THIS CLASS");
ss=in.readLine();

while(j3>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=c1[i];
s1=tb1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct1<6))
{
c1[i]=ss;
tb1[i]="3";
ct1++;
j3--;g=0;ff=1;
break;
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c2[i];
s1=tb2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct2<6))
{
c2[i]=ss;
tb2[i]="3";
ct2++;g=0;ff=1;
j3--;
break;
}
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c3[i];
s1=tb3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct3<6))
{
c3[i]=ss;
tb3[i]="3";
ct3++;g=0;ff=1;
j3--;
break;
}
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c4[i];
s1=tb4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct4<6))
{
c4[i]=ss;
tb4[i]="3";
ct4++;
j3--;g=0;ff=1;
break;
}
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c5[i];
s1=tb5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct5<6))
{
c5[i]=ss;
tb5[i]="3";
ct5++;g=0;ff=1;
j3--;
break;
}
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c6[i];
s1=tb6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct6<6))
{
c6[i]=ss;
tb6[i]="3";
ct6++;g=0;ff=1;
j3--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==4||m==9)
{
System.out.println("How many periods do you want "+tt2+" to give in this class");
j4=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt2+" IN THIS CLASS");
ss=in.readLine();


while(j4>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=d1[i];
s1=tb1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct1<6))
{
d1[i]=ss;
tb1[i]="4";
ct1++;g=0;ff=1;
j4--;
break;
}
}


if(j4>0)
{
for(i=0;i<8;i++)
{
s=d2[i];
s1=tb2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct2<6))
{
d2[i]=ss;
tb2[i]="4";
ct2++;g=0;ff=1;
j4--;
break;
}
}
}

if(j4>0)
{

for(i=0;i<8;i++)
{
s=d3[i];
s1=tb3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct3<6))
{
d3[i]=ss;
tb3[i]="4";
ct3++;g=0;ff=1;
j4--;
break;
}
}
}

if(j4>0)
{
for(i=0;i<8;i++)
{
s=d4[i];
s1=tb4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ct4<6))
{
d4[i]=ss;
tb4[i]="4";
ct4++;g=0;ff=1;
j4--;
break;
}
}
}

if(j4>0)
{
for(i=0;i<8;i++)
{
s=d5[i];
s1=tb5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct5<6))
{
d5[i]=ss;
tb5[i]="4";
ct5++;g=0;ff=1;
j4--;
break;
}
}
}

if(j4>0)
{
for(i=0;i<8;i++)
{
s=d6[i];
s1=tb6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct6<6))
{
d6[i]=ss;
tb6[i]="4";
ct6++;g=0;ff=1;
j4--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}


if(m==5||m==10)
{
System.out.println("How many periods do you want "+tt2+" to give in this class");
j5=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt2+" IN THIS CLASS");
ss=in.readLine();


while(j5>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=e1[i];
s1=tb1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct1<6))
{
e1[i]=ss;
tb1[i]="5";
ct1++;g=0;ff=1;
j5--;
break;
}
}


if(j5>0)
{
for(i=0;i<8;i++)
{
s=e2[i];
s1=tb2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct2<6))
{
e2[i]=ss;
tb2[i]="5";
ct2++;g=0;ff=1;
j5--;
break;
}
}
}

if(j5>0)
{

for(i=0;i<8;i++)
{
s=e3[i];
s1=tb3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct3<6))
{
e3[i]=ss;
tb3[i]="5";
ct3++;g=0;ff=1;
j5--;
break;
}
}
}

if(j5>0)
{
for(i=0;i<8;i++)
{
s=e4[i];
s1=tb4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ct4<6))
{
e4[i]=ss;
tb4[i]="5";
ct4++;g=0;ff=1;
j5--;
break;
}
}
}

if(j5>0)
{
for(i=0;i<8;i++)
{
s=e5[i];
s1=tb5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct5<6))
{
e5[i]=ss;
tb5[i]="5";
ct5++;g=0;ff=1;
j5--;
break;
}
}
}

if(j5>0)
{
for(i=0;i<8;i++)
{
s=e6[i];
s1=tb6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ct6<6))
{
e6[i]=ss;
tb6[i]="5";
ct6++;g=0;ff=1;
j5--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

}

if(ch==3)
{
System.out.println("Enter the class which you want to give to "+tt3);
m=Integer.parseInt(in.readLine());
if(m==1||m==6)
{
System.out.println("How many periods do you want "+tt3+" to give in this class");
j1=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt3+" IN THIS CLASS");
ss=in.readLine();
while(j1>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=a1[i];
s1=tc1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc1<6))
{
a1[i]=ss;
tc1[i]="1";
cc1++;
j1--;g=0;ff=1;
break;
}
}


if(j1>0)
{
for(i=0;i<8;i++)
{
s=a2[i];
s1=tc2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc2<6))
{
a2[i]=ss;
tc2[i]="1";
cc2++;g=0;ff=1;
j1--;
break;
}
}
}

if(j1>0)
{

for(i=0;i<8;i++)
{
s=a3[i];
s1=tc3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc3<6))
{
a3[i]=ss;
tc3[i]="1";
cc3++;g=0;ff=1;
j1--;
break;
}
}
}

if(j1>0)
{
for(i=0;i<8;i++)
{
s=a4[i];
s1=tc4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(cc4<6))
{
a4[i]=ss;
tc4[i]="1";
cc4++;g=0;ff=1;
j1--;
break;
}
}
}

if(j1>0)
{
for(i=0;i<8;i++)
{
s=a5[i];
s1=tc5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc5<6))
{
a5[i]=ss;
tc5[i]="1";
cc5++;g=0;ff=1;
j1--;
break;
}
}
}

if(j1>0)
{
for(i=0;i<8;i++)
{
s=a6[i];
s1=tc6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc6<6))
{
a6[i]=ss;
tc6[i]="1";
cc6++;g=0;ff=1;
j1--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==2||m==7)
{
System.out.println("How many periods do you want "+tt3+" to give in this class");
j2=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt3+" IN THIS CLASS");
ss=in.readLine();

while(j2>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=b1[i];
s1=tc1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc1<6))
{
b1[i]=ss;
tc1[i]="2";
cc1++;g=0;ff=1;
j2--;
break;
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b2[i];
s1=tc2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc2<6))
{
b2[i]=ss;
tc2[i]="2";
cc2++;g=0;ff=1;
j2--;
break;
}
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b3[i];
s1=tc3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc3<6))
{
b3[i]=ss;
tc3[i]="2";
cc3++;g=0;ff=1;
j2--;
break;
}
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b4[i];
s1=tc4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc4<6))
{
b4[i]=ss;
tc4[i]="2";
cc4++;g=0;ff=1;
j2--;
break;
}
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b5[i];
s1=tc5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc5<6))
{
b5[i]=ss;
tc5[i]="2";
cc5++;g=0;ff=1;
j2--;
break;
}
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b6[i];
s1=tc6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc6<6))
{
b6[i]=ss;
tc6[i]="2";
cc6++;g=0;ff=1;
j2--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==3||m==8)
{
System.out.println("How many periods do you want "+tt3+" to give in this class");
j3=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt3+" IN THIS CLASS");
ss=in.readLine();

while(j3>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=c1[i];
s1=tc1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc1<6))
{
c1[i]=ss;
tc1[i]="3";
cc1++;g=0;ff=1;
j3--;
break;
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c2[i];
s1=tc2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc2<6))
{
c2[i]=ss;
tc2[i]="3";
cc2++;g=0;ff=1;
j3--;
break;
}
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c3[i];
s1=tc3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc3<6))
{
c3[i]=ss;
tc3[i]="3";
cc3++;g=0;ff=1;
j3--;
break;
}
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c4[i];
s1=tc4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc4<6))
{
c4[i]=ss;
tc4[i]="3";
cc4++;g=0;ff=1;
j3--;
break;
}
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c5[i];
s1=tc5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc5<6))
{
c5[i]=ss;
tc5[i]="3";
cc5++;
j3--;g=0;ff=1;
break;
}
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c6[i];
s1=tc6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc6<6))
{
c6[i]=ss;
tc6[i]="3";
cc6++;g=0;ff=1;
j3--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}
}
}

if(m==4||m==5)
{
System.out.println("How many periods do you want "+tt3+" to give in this class");
j4=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt3+" IN THIS CLASS");
ss=in.readLine();
while(j4>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=d1[i];
s1=tc1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc1<6))
{
d1[i]=ss;
tc1[i]="4";
cc1++;
j4--;g=0;ff=1;
break;
}
}


if(j4>0)
{
for(i=0;i<8;i++)
{
s=d2[i];
s1=tc2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc2<6))
{
d2[i]=ss;
tc2[i]="4";
cc2++;g=0;ff=1;
j4--;
break;
}
}
}

if(j4>0)
{

for(i=0;i<8;i++)
{
s=d3[i];
s1=tc3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc3<6))
{
d3[i]=ss;
tc3[i]="4";
cc3++;g=0;ff=1;
j4--;
break;
}
}
}

if(j4>0)
{
for(i=0;i<8;i++)
{
s=d4[i];
s1=tc4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(cc4<6))
{
d4[i]=ss;
tc4[i]="4";
cc4++;g=0;ff=1;
j4--;
break;
}
}
}

if(j4>0)
{
for(i=0;i<8;i++)
{
s=d5[i];
s1=tc5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc5<6))
{
d5[i]=ss;
tc5[i]="4";
cc5++;g=0;ff=1;
j4--;
break;
}
}
}

if(j4>0)
{
for(i=0;i<8;i++)
{
s=d6[i];
s1=tc6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc6<6))
{
d6[i]=ss;
tc6[i]="4";
cc6++;g=0;ff=1;
j4--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==5||m==10)
{
System.out.println("How many periods do you want "+tt3+" to give in this class");
j5=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt3+" IN THIS CLASS");
ss=in.readLine();
while(j5>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=e1[i];
s1=tc1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc1<6))
{
e1[i]=ss;
tc1[i]="5";
cc1++;
j5--;g=0;ff=1;
break;
}
}


if(j5>0)
{
for(i=0;i<8;i++)
{
s=e2[i];
s1=tc2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc2<6))
{
e2[i]=ss;
tc2[i]="5";
cc2++;g=0;ff=1;
j5--;
break;
}
}
}

if(j5>0)
{

for(i=0;i<8;i++)
{
s=e3[i];
s1=tc3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc3<6))
{
e3[i]=ss;
tc3[i]="5";
cc3++;g=0;ff=1;
j5--;
break;
}
}
}

if(j5>0)
{
for(i=0;i<8;i++)
{
s=e4[i];
s1=tc4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(cc4<6))
{
e4[i]=ss;
tc4[i]="5";
cc4++;g=0;ff=1;
j5--;
break;
}
}
}

if(j5>0)
{
for(i=0;i<8;i++)
{
s=e5[i];
s1=tc5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc5<6))
{
e5[i]=ss;
tc5[i]="5";
cc5++;g=0;ff=1;
j5--;
break;
}
}
}

if(j5>0)
{
for(i=0;i<8;i++)
{
s=e6[i];
s1=tc6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(cc6<6))
{
e6[i]=ss;
tc6[i]="5";
cc6++;g=0;ff=1;
j5--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

}

if(ch==4)
{
System.out.println("Enter the class which you want to give to "+tt4);
m=Integer.parseInt(in.readLine());
if(m==1||m==6)
{
System.out.println("How many periods do you want "+tt4+" to give in this class");
j1=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU WANT TO GIVE "+tt4+" IN THIS CLASS");
ss=in.readLine();

while(j1>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=a1[i];
s1=td1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc1<6))
{
a1[i]=ss;
td1[i]="1";
ctc1++;g=0;ff=1;
j1--;
break;
}
}


if(j1>0)
{
for(i=0;i<8;i++)
{
s=a2[i];
s1=td2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc2<6))
{
a2[i]=ss;
td2[i]="1";
ctc2++;g=0;ff=1;
j1--;
break;
}
}
}

if(j1>0)
{

for(i=0;i<8;i++)
{
s=a3[i];
s1=td3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc3<6))
{
a3[i]=ss;
td3[i]="1";
ctc3++;g=0;ff=1;
j1--;
break;
}
}
}

if(j1>0)
{
for(i=0;i<8;i++)
{
s=a4[i];
s1=td4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctc4<6))
{
a4[i]=ss;
td4[i]="1";
ctc4++;g=0;ff=1;
j1--;
break;
}
}
}

if(j1>0)
{
for(i=0;i<8;i++)
{
s=a5[i];
s1=td5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc5<6))
{
a5[i]=ss;
td5[i]="1";
ctc5++;g=0;ff=1;
j1--;
break;
}
}
}

if(j1>0)
{
for(i=0;i<8;i++)
{
s=a6[i];
s1=td6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc6<6))
{
a6[i]=ss;
td6[i]="1";
ctc6++;g=0;ff=1;
j1--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==2||m==7)
{
System.out.println("How many periods do you want "+tt4+" to give in this class");
j2=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt4+" IN THIS CLASS");
ss=in.readLine();


while(j2>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=b1[i];
s1=td1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc1<6))
{
b1[i]=ss;
td1[i]="2";
ctc1++;g=0;ff=1;
j2--;
break;
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b2[i];
s1=td2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc2<6))
{
b2[i]=ss;
td2[i]="2";
ctc2++;g=0;ff=1;
j2--;
break;
}
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b3[i];
s1=td3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc3<6))
{
b3[i]=ss;
td3[i]="2";g=0;ff=1;
ctc3++;g=0;ff=1;
j2--;
break;
}
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b4[i];
s1=td4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc4<6))
{
b4[i]=ss;
td4[i]="2";
ctc4++;g=0;ff=1;
j2--;
break;
}
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b5[i];
s1=td5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc5<6))
{
b5[i]=ss;
td5[i]="2";
ctc5++;g=0;ff=1;
j2--;
break;
}
}
}

if(j2>0)
{
for(i=0;i<8;i++)
{
s=b6[i];
s1=td6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc6<6))
{
b6[i]=ss;
td6[i]="2";
ctc6++;g=0;ff=1;
j2--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}
}
}

if(m==3||m==8)
{
System.out.println("How many periods do you want "+tt4+" to give in this class");
j3=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt4+" IN THIS CLASS");
ss=in.readLine();


while(j3>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=c1[i];
s1=td1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc1<6))
{
c1[i]=ss;
td1[i]="3";
ctc1++;g=0;ff=1;
j3--;
break;
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c2[i];
s1=td2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc2<6))
{
c2[i]=ss;
td2[i]="3";
ctc2++;g=0;ff=1;
j3--;
break;
}
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c3[i];
s1=td3[i];

if(s.equalsIgnoreCase("ta"))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc3<6))
{
c3[i]=ss;
td3[i]="3";
ctc3++;g=0;ff=1;
j3--;
break;
}
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c4[i];
s1=td4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc4<6))
{
c4[i]=ss;
td4[i]="3";
ctc4++;g=0;ff=1;
j3--;
break;
}
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c5[i];
s1=td5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc5<6))
{
c5[i]=ss;
td5[i]="3";
ctc5++;g=0;ff=1;
j3--;
break;
}
}
}

if(j3>0)
{
for(i=0;i<8;i++)
{
s=c6[i];
s1=td6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc6<6))
{
c6[i]=ss;
td6[i]="3";g=0;ff=1;
ctc6++;
j3--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==4||m==9)
{
System.out.println("How many periods do you want "+tt4+" to give in this class");
j4=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU WANT TO GIVE "+tt4+" IN THIS CLASS");
ss=in.readLine();

while(j4>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=d1[i];
s1=td1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc1<6))
{
d1[i]=ss;
td1[i]="4";
ctc1++;g=0;ff=1;
j4--;
break;
}
}


if(j4>0)
{
for(i=0;i<8;i++)
{
s=d2[i];
s1=td2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc2<6))
{
d2[i]=ss;
td2[i]="4";
ctc2++;g=0;ff=1;
j4--;
break;
}
}
}

if(j4>0)
{

for(i=0;i<8;i++)
{
s=d3[i];
s1=td3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc3<6))
{
d3[i]=ss;
td3[i]="4";
ctc3++;g=0;ff=1;
j4--;
break;
}
}
}

if(j4>0)
{
for(i=0;i<8;i++)
{
s=d4[i];
s1=td4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctc4<6))
{
d4[i]=ss;
td4[i]="4";
ctc4++;g=0;ff=1;
j4--;
break;
}
}
}

if(j4>0)
{
for(i=0;i<8;i++)
{
s=d5[i];
s1=td5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc5<6))
{
d5[i]=ss;
td5[i]="4";
ctc5++;g=0;ff=1;
j4--;
break;
}
}
}

if(j4>0)
{
for(i=0;i<8;i++)
{
s=d6[i];
s1=td6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc6<6))
{
d6[i]=ss;
td6[i]="4";
ctc6++;g=0;ff=1;
j4--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==5||m==10)
{
System.out.println("How many periods do you want "+tt4+" to give in this class");
j5=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU WANT TO GIVE "+tt4+" IN THIS CLASS");
ss=in.readLine();

while(j5>0)
{
int ff=0;
for(i=0;i<8;i++)
{
s=e1[i];
s1=td1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc1<6))
{
e1[i]=ss;
td1[i]="5";
ctc1++;g=0;ff=1;
j5--;
break;
}
}


if(j5>0)
{
for(i=0;i<8;i++)
{
s=e2[i];
s1=td2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc2<6))
{
e2[i]=ss;
td2[i]="5";
ctc2++;g=0;ff=1;
j5--;
break;
}
}
}

if(j5>0)
{

for(i=0;i<8;i++)
{
s=e3[i];
s1=td3[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc3<6))
{
e3[i]=ss;
td3[i]="5";
ctc3++;g=0;ff=1;
j5--;
break;
}
}
}

if(j5>0)
{
for(i=0;i<8;i++)
{
s=e4[i];
s1=td4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(ctc4<6))
{
e4[i]=ss;
td4[i]="5";
ctc4++;g=0;ff=1;
j5--;
break;
}
}
}

if(j5>0)
{
for(i=0;i<8;i++)
{
s=e5[i];
s1=td5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc5<6))
{
e5[i]=ss;
td5[i]="5";
ctc5++;g=0;ff=1;
j5--;
break;
}
}
}

if(j5>0)
{
for(i=0;i<8;i++)
{
s=e6[i];
s1=td6[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(ctc6<6))
{
e6[i]=ss;
td6[i]="5";
ctc6++;g=0;ff=1;
j5--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}
}

if(ch==5)
{
System.out.println("Enter the class which you want to give to "+tt5);
m=Integer.parseInt(in.readLine());
if(m==1||m==6)
{
System.out.println("How many periods do you want "+tt5+" to give in this class");
p1=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt5+" IN THIS CLASS");
ss=in.readLine();

while(p1>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=a1[i];
s1=te1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(t1<6))
{
a1[i]=ss;
te1[i]="1";
t1++;
p1--;ff=1;g=0;
break;
}
}


if(p1>0)
{
for(i=0;i<8;i++)
{
s=a2[i];
s1=te2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(t2<6))
{
a2[i]=ss;
te2[i]="1";
t2++;
p1--;ff=1;g=0;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a3[i];
s1=te3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(t3<6))
{
a3[i]=ss;
te3[i]="1";
t3++;g=0;ff=1;
p1--;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a4[i];
s1=te4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(t4<6))
{
a4[i]=ss;
te4[i]="1";
t4++;g=0;ff=1;
p1--;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a5[i];
s1=te5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(t5<6))
{
a5[i]=ss;
te5[i]="1";
t5++;
p1--;g=0;ff=1;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a6[i];
s1=te6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(t6<6))
{
a6[i]=ss;
te6[i]="1";
t6++;g=0;ff=1;
p1--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==2||m==7)
{
System.out.println("How many periods do you want "+tt5+" to give in this class");
p2=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt5+" IN THIS CLASS");
ss=in.readLine();

while(p2>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=b1[i];
s1=te1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(t1<6))
{
b1[i]=ss;
te1[i]="2";
t1++;
p2--;ff=1;g=0;
break;
}
}


if(p2>0)
{
for(i=0;i<8;i++)
{
s=b2[i];
s1=te2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(t2<6))
{
b2[i]=ss;
te2[i]="2";
t2++;
p2--;ff=1;g=0;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{
s=b3[i];
s1=te3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(t3<6))
{
b3[i]=ss;
te3[i]="2";
t3++;g=0;ff=1;
p2--;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{
s=b4[i];
s1=te4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(t4<6))
{
b4[i]=ss;
te4[i]="2";
t4++;g=0;ff=1;
p2--;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{
s=b5[i];
s1=te5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(t5<6))
{
b5[i]=ss;
te5[i]="2";
t5++;
p2--;g=0;ff=1;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{
s=b6[i];
s1=te6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(t6<6))
{
b6[i]=ss;
te6[i]="2";
t6++;g=0;ff=1;
p2--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==3||m==8)
{
System.out.println("How many periods do you want "+tt5+" to give in this class");
p3=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt5+" IN THIS CLASS");
ss=in.readLine();

while(p3>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=c1[i];
s1=te1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(t1<6))
{
c1[i]=ss;
te1[i]="3";
t1++;
p3--;ff=1;g=0;
break;
}
}


if(p3>0)
{
for(i=0;i<8;i++)
{
s=c2[i];
s1=te2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(t2<6))
{
c2[i]=ss;
te2[i]="3";
t2++;
p3--;ff=1;g=0;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{
s=c3[i];
s1=te3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(t3<6))
{
c3[i]=ss;
te3[i]="3";
t3++;g=0;ff=1;
p3--;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{
s=c4[i];
s1=te4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(t4<6))
{
c4[i]=ss;
te4[i]="3";
t4++;g=0;ff=1;
p3--;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{
s=c5[i];
s1=te5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(t5<6))
{
c5[i]=ss;
te5[i]="3";
t5++;
p3--;g=0;ff=1;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{
s=c6[i];
s1=te6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(t6<6))
{
c6[i]=ss;
te6[i]="3";
t6++;g=0;ff=1;
p3--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==4||m==9)
{
System.out.println("How many periods do you want "+tt5+" to give in this class");
p4=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt5+" IN THIS CLASS");
ss=in.readLine();

while(p4>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=d1[i];
s1=te1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(t1<6))
{
d1[i]=ss;
te1[i]="4";
t1++;
p4--;ff=1;g=0;
break;
}
}


if(p4>0)
{
for(i=0;i<8;i++)
{
s=d2[i];
s1=te2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(t2<6))
{
d2[i]=ss;
te2[i]="4";
t2++;
p4--;ff=1;g=0;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d3[i];
s1=te3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(t3<6))
{
d3[i]=ss;
te3[i]="4";
t3++;g=0;ff=1;
p4--;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d4[i];
s1=te4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(t4<6))
{
d4[i]=ss;
te4[i]="4";
t4++;g=0;ff=1;
p4--;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d5[i];
s1=te5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(t5<6))
{
d5[i]=ss;
te5[i]="4";
t5++;
p4--;g=0;ff=1;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d6[i];
s1=te6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(t6<6))
{
d6[i]=ss;
te6[i]="4";
t6++;g=0;ff=1;
p4--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==5||m==10)
{
System.out.println("How many periods do you want "+tt5+" to give in this class");
p5=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt5+" IN THIS CLASS");
ss=in.readLine();

while(p5>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=e1[i];
s1=te1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(t1<6))
{
e1[i]=ss;
te1[i]="5";
t1++;
p5--;ff=1;g=0;
break;
}
}


if(p5>0)
{
for(i=0;i<8;i++)
{
s=e2[i];
s1=te2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(t2<6))
{
e2[i]=ss;
te2[i]="5";
t2++;
p5--;ff=1;g=0;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e3[i];
s1=te3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(t3<6))
{
e3[i]=ss;
te3[i]="5";
t3++;g=0;ff=1;
p5--;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e4[i];
s1=te4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(t4<6))
{
e4[i]=ss;
te4[i]="5";
t4++;g=0;ff=1;
p5--;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e5[i];
s1=te5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(t5<6))
{
e5[i]=ss;
te5[i]="5";
t5++;
p5--;g=0;ff=1;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e6[i];
s1=te6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(t6<6))
{
e6[i]=ss;
te6[i]="5";
t6++;g=0;ff=1;
p5--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

}

if(ch==6)
{
System.out.println("Enter the class which you want to give to "+tt6);
m=Integer.parseInt(in.readLine());
if(m==1||m==6)
{
System.out.println("How many periods do you want "+tt6+" to give in this class");
p1=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt6+" IN THIS CLASS");
ss=in.readLine();

while(p1>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=a1[i];
s1=tf1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(o1<6))
{
a1[i]=ss;
tf1[i]="1";
o1++;
p1--;ff=1;g=0;
break;
}
}


if(p1>0)
{
for(i=0;i<8;i++)
{
s=a2[i];
s1=tf2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(o2<6))
{
a2[i]=ss;
tf2[i]="1";
o2++;
p1--;ff=1;g=0;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a3[i];
s1=tf3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(o3<6))
{
a3[i]=ss;
tf3[i]="1";
o3++;g=0;ff=1;
p1--;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a4[i];
s1=tf4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(o4<6))
{
a4[i]=ss;
tf4[i]="1";
o4++;g=0;ff=1;
p1--;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a5[i];
s1=tf5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(o5<6))
{
a5[i]=ss;
tf5[i]="1";
o5++;
p1--;g=0;ff=1;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a6[i];
s1=tf6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(o6<6))
{
a6[i]=ss;
tf6[i]="1";
o6++;g=0;ff=1;
p1--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==2||m==7)
{
System.out.println("How many periods do you want "+tt6+" to give in this class");
p2=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt6+" IN THIS CLASS");
ss=in.readLine();

while(p2>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=b1[i];
s1=tf1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(o1<6))
{
b1[i]=ss;
tf1[i]="2";
o1++;
p2--;ff=1;g=0;
break;
}
}


if(p2>0)
{
for(i=0;i<8;i++)
{
s=b2[i];
s1=tf2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(o2<6))
{
b2[i]=ss;
tf2[i]="2";
o2++;
p2--;ff=1;g=0;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{
s=b3[i];
s1=tf3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(o3<6))
{
b3[i]=ss;
tf3[i]="2";
o3++;g=0;ff=1;
p2--;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{
s=b4[i];
s1=tf4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(o4<6))
{
b4[i]=ss;
tf4[i]="2";
o4++;g=0;ff=1;
p2--;
break;
}
}
}
if(p2>0)
{
for(i=0;i<8;i++)
{
s=b5[i];
s1=tf5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(o5<6))
{
b5[i]=ss;
tf5[i]="2";
o5++;
p2--;g=0;ff=1;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{
s=b6[i];
s1=tf6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(o6<6))
{
b6[i]=ss;
tf6[i]="2";
o6++;g=0;ff=1;
p2--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==3||m==8)
{
System.out.println("How many periods do you want "+tt6+" to give in this class");
p3=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt6+" IN THIS CLASS");
ss=in.readLine();

while(p3>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=c1[i];
s1=tf1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(o1<6))
{
c1[i]=ss;
tf1[i]="3";
o1++;
p3--;ff=1;g=0;
break;
}
}


if(p3>0)
{
for(i=0;i<8;i++)
{
s=c2[i];
s1=tf2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(o2<6))
{
c2[i]=ss;
tf2[i]="3";
o2++;
p3--;ff=1;g=0;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{
s=c3[i];
s1=tf3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(o3<6))
{
c3[i]=ss;
tf3[i]="3";
o3++;g=0;ff=1;
p3--;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{
s=c4[i];
s1=tf4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(o4<6))
{
c4[i]=ss;
tf4[i]="3";
o4++;g=0;ff=1;
p3--;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{
s=c5[i];
s1=tf5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(o5<6))
{
c5[i]=ss;
tf5[i]="3";
o5++;
p3--;g=0;ff=1;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{
s=c6[i];
s1=tf6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(o6<6))
{
c6[i]=ss;
tf6[i]="3";
o6++;g=0;ff=1;
p3--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==4||m==9)
{
System.out.println("How many periods do you want "+tt6+" to give in this class");
p4=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt6+" IN THIS CLASS");
ss=in.readLine();

while(p4>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=d1[i];
s1=tf1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(o1<6))
{
d1[i]=ss;
tf1[i]="4";
o1++;
p4--;ff=1;g=0;
break;
}
}


if(p4>0)
{
for(i=0;i<8;i++)
{
s=d2[i];
s1=tf2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(o2<6))
{
d2[i]=ss;
tf2[i]="4";
o2++;
p4--;ff=1;g=0;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d3[i];
s1=tf3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(o3<6))
{
d3[i]=ss;
tf3[i]="4";
o3++;g=0;ff=1;
p4--;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d4[i];
s1=tf4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(o4<6))
{
d4[i]=ss;
tf4[i]="4";
o4++;g=0;ff=1;
p4--;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d5[i];
s1=tf5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(o5<6))
{
d5[i]=ss;
tf5[i]="4";
o5++;
p4--;g=0;ff=1;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d6[i];
s1=tf6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(o6<6))
{
d6[i]=ss;
tf6[i]="4";
o6++;g=0;ff=1;
p4--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==5||m==10)
{
System.out.println("How many periods do you want "+tt6+" to give in this class");
p5=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt6+" IN THIS CLASS");
ss=in.readLine();

while(p5>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=e1[i];
s1=tf1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(o1<6))
{
e1[i]=ss;
tf1[i]="5";
o1++;
p5--;ff=1;g=0;
break;
}
}


if(p5>0)
{
for(i=0;i<8;i++)
{
s=e2[i];
s1=tf2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(o2<6))
{
e2[i]=ss;
tf2[i]="5";
o2++;
p5--;ff=1;g=0;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e3[i];
s1=tf3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(o3<6))
{
e3[i]=ss;
tf3[i]="5";
o3++;g=0;ff=1;
p5--;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e4[i];
s1=tf4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(o4<6))
{
e4[i]=ss;
tf4[i]="5";
o4++;g=0;ff=1;
p5--;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e5[i];
s1=tf5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(o5<6))
{
e5[i]=ss;
tf5[i]="5";
o5++;
p5--;g=0;ff=1;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e6[i];
s1=tf6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(o6<6))
{
e6[i]=ss;
tf6[i]="5";
o6++;g=0;ff=1;
p5--;
break;
}
}
}
if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

}

if(ch==7)
{
System.out.println("Enter the class which you want to give to "+tt7);
m=Integer.parseInt(in.readLine());
if(m==1||m==6)
{
System.out.println("How many periods do you want "+tt7+" to give in this class");
p1=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt7+" IN THIS CLASS");
ss=in.readLine();

while(p1>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=a1[i];
s1=tg1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(x1<6))
{
a1[i]=ss;
tg1[i]="1";
x1++;
p1--;ff=1;g=0;
break;
}
}


if(p1>0)
{
for(i=0;i<8;i++)
{
s=a2[i];
s1=tg2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(x2<6))
{
a2[i]=ss;
tg2[i]="1";
x2++;
p1--;ff=1;g=0;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a3[i];
s1=tg3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(x3<6))
{
a3[i]=ss;
tg3[i]="1";
x3++;g=0;ff=1;
p1--;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a4[i];
s1=tg4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(x4<6))
{
a4[i]=ss;
tg4[i]="1";
x4++;g=0;ff=1;
p1--;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a5[i];
s1=tg5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(x5<6))
{
a5[i]=ss;
tg5[i]="1";
x5++;
p1--;g=0;ff=1;
break;
}
}
}

if(p1>0)
{
for(i=0;i<8;i++)
{
s=a6[i];
s1=tg6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(x6<6))
{
a6[i]=ss;
tg6[i]="1";
x6++;g=0;ff=1;
p1--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==2||m==7)
{
System.out.println("How many periods do you want "+tt7+" to give in this class");
p2=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt7+" IN THIS CLASS");
ss=in.readLine();

while(p2>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=b1[i];
s1=tg1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(x1<6))
{
b1[i]=ss;
tg1[i]="2";
x1++;
p2--;ff=1;g=0;
break;
}
}


if(p2>0)
{
for(i=0;i<8;i++)
{
s=b2[i];
s1=tg2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(x2<6))
{
b2[i]=ss;
tg2[i]="2";
x2++;
p2--;ff=1;g=0;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{
s=b3[i];
s1=tg3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(x3<6))
{
b3[i]=ss;
tg3[i]="2";
x3++;g=0;ff=1;
p2--;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{
s=b4[i];
s1=tg4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(x4<6))
{
b4[i]=ss;
tg4[i]="2";
x4++;g=0;ff=1;
p2--;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{
s=b5[i];
s1=tg5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(x5<6))
{
b5[i]=ss;
tg5[i]="2";
x5++;
p2--;g=0;ff=1;
break;
}
}
}

if(p2>0)
{
for(i=0;i<8;i++)
{
s=b6[i];
s1=tg6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(x6<6))
{
b6[i]=ss;
tg6[i]="2";
x6++;g=0;ff=1;
p2--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==3||m==8)
{
System.out.println("How many periods do you want "+tt7+" to give in this class");
p3=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt7+" IN THIS CLASS");
ss=in.readLine();

while(p3>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=c1[i];
s1=tg1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(x1<6))
{
c1[i]=ss;
tg1[i]="3";
x1++;
p3--;ff=1;g=0;
break;
}
}


if(p3>0)
{
for(i=0;i<8;i++)
{
s=c2[i];
s1=tg2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(x2<6))
{
c2[i]=ss;
tg2[i]="3";
x2++;
p3--;ff=1;g=0;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{
s=c3[i];
s1=tg3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(x3<6))
{
c3[i]=ss;
tg3[i]="3";
x3++;g=0;ff=1;
p3--;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{
s=c4[i];
s1=tg4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(x4<6))
{
c4[i]=ss;
tg4[i]="3";
x4++;g=0;ff=1;
p3--;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{
s=c5[i];
s1=tg5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(x5<6))
{
c5[i]=ss;
tg5[i]="3";
x5++;
p3--;g=0;ff=1;
break;
}
}
}

if(p3>0)
{
for(i=0;i<8;i++)
{
s=c6[i];
s1=tg6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(x6<6))
{
c6[i]=ss;
tg6[i]="3";
x6++;g=0;ff=1;
p3--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==4||m==9)
{
System.out.println("How many periods do you want "+tt7+" to give in this class");
p4=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt7+" IN THIS CLASS");
ss=in.readLine();

while(p4>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=d1[i];
s1=tg1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(x1<6))
{
d1[i]=ss;
tg1[i]="4";
x1++;
p4--;ff=1;g=0;
break;
}
}


if(p4>0)
{
for(i=0;i<8;i++)
{
s=d2[i];
s1=tg2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(x2<6))
{
d2[i]=ss;
tg2[i]="4";
x2++;
p4--;ff=1;g=0;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d3[i];
s1=tg3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(x3<6))
{
d3[i]=ss;
tg3[i]="4";
x3++;g=0;ff=1;
p4--;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d4[i];
s1=tg4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(x4<6))
{
d4[i]=ss;
tg4[i]="4";
x4++;g=0;ff=1;
p4--;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d5[i];
s1=tg5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(x5<6))
{
d5[i]=ss;
tg5[i]="4";
x5++;
p4--;g=0;ff=1;
break;
}
}
}

if(p4>0)
{
for(i=0;i<8;i++)
{
s=d6[i];
s1=tg6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(x6<6))
{
d6[i]=ss;
tg6[i]="4";
x6++;g=0;ff=1;
p4--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

if(m==5||m==10)
{
System.out.println("How many periods do you want "+tt7+" to give in this class");
p5=Integer.parseInt(in.readLine()); 

System.out.println("ENTER THE SUBJECT NAME WHICH YOU TO GIVE "+tt7+" IN THIS CLASS");
ss=in.readLine();

while(p5>0)
{
int ff=0;                  
for(i=0;i<8;i++)
{
s=e1[i];
s1=tg1[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(x1<6))
{
e1[i]=ss;
tg1[i]="5";
x1++;
p5--;ff=1;g=0;
break;
}
}


if(p5>0)
{
for(i=0;i<8;i++)
{
s=e2[i];
s1=tg2[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}

if((g==1)&&(x2<6))
{
e2[i]=ss;
tg2[i]="5";
x2++;
p5--;ff=1;g=0;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e3[i];
s1=tg3[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}
if((g==1)&&(x3<6))
{
e3[i]=ss;
tg3[i]="5";
x3++;g=0;ff=1;
p5--;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e4[i];
s1=tg4[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(x4<6))
{
e4[i]=ss;
tg4[i]="5";
x4++;g=0;ff=1;
p5--;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e5[i];
s1=tg5[i];

if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;
else
g=1;
}

if((g==1)&&(x5<6))
{
e5[i]=ss;
tg5[i]="5";
x5++;
p5--;g=0;ff=1;
break;
}
}
}

if(p5>0)
{
for(i=0;i<8;i++)
{
s=e6[i];
s1=tg6[i];
if(s.equalsIgnoreCase(""))
{
if((s1.equalsIgnoreCase("1"))||(s1.equalsIgnoreCase("2"))||(s1.equalsIgnoreCase("3")))
g=0;

else
g=1;
}
if((g==1)&&(x6<6))
{
e6[i]=ss;
tg6[i]="5";
x6++;g=0;ff=1;
p5--;
break;
}
}
}

if(ff==0)
{
System.out.println("NOT POSSIBLE");
break;
}

}
}

}

FileWriter fw=new FileWriter("time table of students.txt");
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw=new PrintWriter(bw);

pw.println();

if(choice==1)
pw.println("time table of 1 class is");
else
pw.println("time table of 6 class is");

for(i=0;i<8;i++)
pw.print(a1[i]+"      ");

pw.println();
 

for(i=0;i<8;i++)
pw.print(a2[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(a3[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(a4[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(a5[i]+"      ");

pw.println(); 


for(i=0;i<8;i++)
pw.print(a6[i]+"      ");

pw.println();
pw.println();

if(choice==1)
pw.println("time table of 2 class is");
else
pw.println("time table of 7 class is");

for(i=0;i<8;i++)
pw.print(b1[i]+"      ");

pw.println();
 
for(i=0;i<8;i++)
pw.print(b2[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(b3[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(b4[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(b5[i]+"      ");

pw.println(); 


for(i=0;i<8;i++)
pw.print(b6[i]+"      ");

pw.println();
pw.println(); 

if(choice==1)
pw.println("time table of 3 class is");
else
pw.println("time table of 8 class is");

for(i=0;i<8;i++)
pw.print(c1[i]+"      ");

pw.println();
 
for(i=0;i<8;i++)
pw.print(c2[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(c3[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(c4[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(c5[i]+"      ");

pw.println(); 


for(i=0;i<8;i++)
pw.print(c6[i]+"      ");

pw.println(); 
pw.println();

if(choice==1)
pw.println("time table of 4 class is");
else
pw.println("time table of 9 class is");

for(i=0;i<8;i++)
pw.print(d1[i]+"      ");

pw.println();
 
for(i=0;i<8;i++)
pw.print(d2[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(d3[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(d4[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(d5[i]+"      ");

pw.println(); 


for(i=0;i<8;i++)
pw.print(d6[i]+"      ");

pw.println(); 
pw.println();

if(choice==1)
pw.println("time table of 5 class is");
else
pw.println("time table of 10 class is");

for(i=0;i<8;i++)
pw.print(e1[i]+"      ");

pw.println();
 
for(i=0;i<8;i++)
pw.print(e2[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(e3[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(e4[i]+"      ");

pw.println(); 

for(i=0;i<8;i++)
pw.print(e5[i]+"      ");

pw.println(); 


for(i=0;i<8;i++)
pw.print(e6[i]+"      ");

pw.println(); 

 
pw.close();
bw.close();
fw.close();

FileWriter Fw=new FileWriter("time table of teachers.txt");
BufferedWriter Bw=new BufferedWriter(Fw);
PrintWriter dw=new PrintWriter(Bw);


dw.println();

dw.println("time table for "+tt1+" is");

for(i=0;i<8;i++)
dw.print(ta1[i]+"      ");

dw.println();
 
for(i=0;i<8;i++)
dw.print(ta2[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(ta3[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(ta4[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(ta5[i]+"      ");

dw.println(); 


for(i=0;i<8;i++)
dw.print(ta6[i]+"      ");

dw.println();
dw.println();

dw.println("time table for "+tt2+" is");

for(i=0;i<8;i++)
dw.print(tb1[i]+"      ");

dw.println();
 
for(i=0;i<8;i++)
dw.print(tb2[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tb3[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tb4[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tb5[i]+"      ");

dw.println(); 


for(i=0;i<8;i++)
dw.print(tb6[i]+"      ");

dw.println();
dw.println();

dw.println("time table for "+tt3+" is");

for(i=0;i<8;i++)
dw.print(tc1[i]+"      ");

dw.println();
 
for(i=0;i<8;i++)
dw.print(tc2[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tc3[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tc4[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tc5[i]+"      ");

dw.println(); 


for(i=0;i<8;i++)
dw.print(tc6[i]+"      ");

dw.println();
dw.println();

dw.println("time table for "+tt4+" is");

for(i=0;i<8;i++)
dw.print(td1[i]+"      ");

dw.println();
 
for(i=0;i<8;i++)
dw.print(td2[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(td3[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(td4[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(td5[i]+"      ");

dw.println(); 


for(i=0;i<8;i++)
dw.print(td6[i]+"      ");

dw.println();
dw.println();

dw.println("time table for "+tt5+" is");

for(i=0;i<8;i++)
dw.print(te1[i]+"      ");

dw.println();
 
for(i=0;i<8;i++)
dw.print(te2[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(te3[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(te4[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(te5[i]+"      ");

dw.println(); 


for(i=0;i<8;i++)
dw.print(te6[i]+"      ");

dw.println();
dw.println();

dw.println("time table for "+tt6+" is");

for(i=0;i<8;i++)
dw.print(tf1[i]+"      ");

dw.println();
 
for(i=0;i<8;i++)
dw.print(tf2[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tf3[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tf4[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tf5[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tf6[i]+"      ");

dw.println();
dw.println();

dw.println("time table for "+tt7+" is");

for(i=0;i<8;i++)
dw.print(tg1[i]+"      ");

dw.println();
 
for(i=0;i<8;i++)
dw.print(tg2[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tg3[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tg4[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tg5[i]+"      ");

dw.println(); 

for(i=0;i<8;i++)
dw.print(tg6[i]+"      ");

dw.println();

dw.close();
Bw.close();
Fw.close();

int z1=ctr1+ctr2+ctr3+ctr4+ctr5+ctr6;
int z2=ct1+ct2+ct3+ct4+ct5+ct6;

int z3=ctc1+ctc2+ctc3+ctc4+ctc5+ctc6;
int z4=cc1+cc2+cc3+cc4+cc5+cc6;

int z5=t1+t2+t3+t4+t5+t6;
int z6=o1+o2+o3+o4+o5+o6;
int z7=x1+x2+x3+x4+x5+x6;

if((z1+z2+z3+z4+z5+z6+z7)==240)
break;

}

System.out.println(); 
System.out.println();

if(choice==1)
System.out.println("time table of 1 class is");
else
System.out.println("time table of 6 class is");

for(i=0;i<8;i++)
System.out.print(a1[i]+"      ");

System.out.println();
 
for(i=0;i<8;i++)
System.out.print(a2[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(a3[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(a4[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(a5[i]+"      ");

System.out.println(); 


for(i=0;i<8;i++)
System.out.print(a6[i]+"      ");

System.out.println(); 


if(choice==1)
System.out.println("time table of 2 class is");
else
System.out.println("time table of 7 class is");

for(i=0;i<8;i++)
System.out.print(b1[i]+"      ");

System.out.println();
 
for(i=0;i<8;i++)
System.out.print(b2[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(b3[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(b4[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(b5[i]+"      ");

System.out.println(); 


for(i=0;i<8;i++)
System.out.print(b6[i]+"      ");

System.out.println(); 

if(choice==1)
System.out.println("time table of 3 class is");
else
System.out.println("time table of 8 class is");

for(i=0;i<8;i++)
System.out.print(c1[i]+"      ");

System.out.println();
 
for(i=0;i<8;i++)
System.out.print(c2[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(c3[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(c4[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(c5[i]+"      ");

System.out.println(); 


for(i=0;i<8;i++)
System.out.print(c6[i]+"      ");

System.out.println(); 

if(choice==1)
System.out.println("time table of 4 class is");
else
System.out.println("time table of 9 class is");

for(i=0;i<8;i++)
System.out.print(d1[i]+"      ");

System.out.println();
 
for(i=0;i<8;i++)
System.out.print(d2[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(d3[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(d4[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(d5[i]+"      ");

System.out.println(); 


for(i=0;i<8;i++)
System.out.print(d6[i]+"      ");

System.out.println(); 

if(choice==1)
System.out.println("time table of 5 class is");
else
System.out.println("time table of 10 class is");

for(i=0;i<8;i++)
System.out.print(e1[i]+"      ");

System.out.println();
 
for(i=0;i<8;i++)
System.out.print(e2[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(e3[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(e4[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(e5[i]+"      ");

System.out.println(); 

for(i=0;i<8;i++)
System.out.print(e6[i]+"      ");

System.out.println(); 

}
}











































  