package newFile;
import java.util.*;

class Gen {
public static void main(String args[])
{
	ArrayList l=new ArrayList();
	ArrayList<String> l1=new ArrayList<String>(10);
	LinkedList<String> ll=new LinkedList<String>();
	HashSet<String> hs=new HashSet<String>();
	l.add("R");
	l.add("V");
	l.add("T");
	Iterator it=l.iterator();
	while(it.hasNext())
		{
		System.out.println(it.next());
		}
	System.out.println("--------------");
	l1.add("R1");
	l1.add("V1");
	Iterator it1=l1.iterator();
	while(it1.hasNext())
		{
		System.out.println(it1.next());
		}
	System.out.println("-----------");
	for(String obj:l1)
		System.out.println(obj);
System.out.println(l1.indexOf("R1"));
System.out.println(l1.lastIndexOf("V1"));
System.out.println("---------");
Object[] ob=l1.toArray();
for(Object obj:ob)
{System.out.println(obj);}
l1.add(1,"W1");
l1.add(2,"W2");
l1.add(2,"W3");
System.out.println("---------");
for(String obj:l1)
{System.out.println(obj);}
System.out.println("-----------");
l1.addAll(3,l);
for(String obj:l1)
{System.out.println(obj);}
System.out.println("-----------");
Object cloneList=l1.clone();
System.out.println(cloneList);
System.out.println("-----------");
l1.trimToSize();
System.out.println(l1);
System.out.println("-----------");
ll.add("A");
ll.add("Q");
ll.addFirst("W");
ll.addLast("X");

for(String obj:ll)
{System.out.println(obj);}
System.out.println(ll.size());
System.out.println(ll.contains("W"));
ll.remove("W");
System.out.println(ll.getFirst());
System.out.println(ll.getLast());
System.out.println("----Listitearator-------");
ListIterator<String> li=l.listIterator();
while(li.hasNext())
	System.out.println(li.next());
System.out.println("-----------");
while(li.hasPrevious())
	System.out.println(li.previous());
System.out.println("----HashSet-------");
hs.add("hs1");
hs.add("hs2");
hs.add("hs3");
System.out.println(hs);
System.out.println("-----------");
hs.clear();
System.out.println(hs);
hs.add("hs1");
hs.add("hs2");
hs.add("hs3");
System.out.println(hs.contains("hs4"));
System.out.println(hs.isEmpty());
System.out.println(hs.iterator());
System.out.println(hs.size());
Collections.sort(ll);
System.out.println(ll);
//editted comment
//branched
}}



