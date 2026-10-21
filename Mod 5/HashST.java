/*
 * HashST.java
 * 
 * A class mostly taken out of the Conmputer Science text book but with additional method written by me.
 * 
 * 
 */
import java.util.*;

public class HashST<Key, Value>
{
	// code copied from text book:
	//why does copying from the online textbook OH NO
	//WHY AREN'T THE WHITESPACE CHJARACTERS SPACES OR TABS???
	//ILLEGAL CHARACTER???
	//give me a second, I've got to replace all the whitespace with characters java can use.
	//why would you make code copiable just to do this to it??? evil.
	
	private int m = 1024;
	private Node[] lists = new Node[m];

	private static class Node // not a tree but a list
	{
		private Object key;
		private Object val;
		private Node next;

		public Node(Object key, Object val, Node next)
		{
		this.key = key;
		this.val = val;
		this.next = next;
		}
	}

	private int hash(Key key)
	{ return Math.abs(key.hashCode() % m); }

	public Value get(Key key)// returns null if key is not in the list. Otherwise, return the value for the key.
	{
		int i = hash(key);
		for (Node x = lists[i]; x != null; x = x.next)
		if (key.equals(x.key))
			return (Value) x.val;
		return null;
	}

	public void put(Key key, Value val)
	{
		int i = hash(key);
		for (Node x = lists[i]; x != null; x = x.next)
		{
			if (key.equals(x.key))
			{
				x.val = val;
				return;
			}
		}
		lists[i] = new Node(key, val, lists[i]);
	}

//new code written by me:

	public boolean contains(Key key)
	{
		return (get(key)!=null);//no need to reinvent the wheel
	}
	
	public int size()
	{
		int count =0;
		for (int i =0; i<lists.length;i++)// for each of the lists
		{
			for (Node x = lists[i];x!=null;x = x.next) //for each node in a list
			{
				count++;
			}
		}
		return count;
	}
	
	public Set keys()
	{
		Set<Key> keySet = new HashSet<>();
		
		for (int i =0; i<lists.length;i++)// for each of the lists
		{
			for (Node x = lists[i];x!=null;x = x.next) //for each node in a list
			{
				keySet.add((Key)x.key);
			}
		}
		
		return keySet;
	}

}

