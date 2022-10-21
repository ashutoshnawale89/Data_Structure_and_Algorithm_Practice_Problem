package com.DataStructureProgram;

import java.util.ArrayList;
import java.util.Objects;


public class HashMap<K,V> {
	

	//A node of chains
	class HashNode<K> {
	    K key;
	    final int hashCode;

	    // Reference to next node
	    HashNode<K> next;

	    // Parameterized Constructor
	    public HashNode(K key, int hashCode) {
	        this.key = key;
	        this.hashCode = hashCode;
	    }
	}

	// Class to represent entire hash table
	    // bucketArray is used to store array of chains
	    private ArrayList<HashNode<K>> bucketArray;

	    // Current capacity of array list
	    private int numBuckets;

	    // Current size of array list
	    private int size;

	    // Constructor (Initializes capacity, size and
	    // empty chains.
	    public HashMap() {
	        bucketArray = new ArrayList<>(); // Create arraylist
	        numBuckets = 11;
	        size = 0;

	        // Create empty chains
	        for (int i = 0; i < numBuckets; i++)
	            bucketArray.add(null);
	    }

	    private final int hashCode(K key) {
//	    	System.out.println(key+"   "+Objects.hashCode(key));
	        return Objects.hashCode(key);
	    }

	    // This implements hash function to find index
	    // for a key
	    private int getBucketIndex(K key) {
	        int hashCode = hashCode(key);
	        int index = hashCode % numBuckets;

	        // key.hashCode() could be negative. -3 * -1 ==> 3
	        index = index < 0 ? index * -1 : index;

	        return index; // return bucket number
	    }

	    // Method to remove a given key
	    public void remove(K key) {
	        // Apply hash function to find index for given key
	        int bucketIndex = getBucketIndex(key);
	        int hashCode = hashCode(key);
	        // Get head of chain
	        HashNode<K> head = bucketArray.get(bucketIndex);

	        // If key was not there
	        if (head == null)
	            return;
	        else if (head.next == null && head.key.equals(key) && hashCode == head.hashCode) {
	            head = null;
	            bucketArray.set(bucketIndex, head); // ******** Added Newly
	            return;
	        }

	        HashNode<K> temp = head;
	        HashNode<K> left = temp;
	        HashNode<K> right = left.next;

	        // Delete First
	        if (temp.key.equals(key) && hashCode == temp.hashCode) {
	            temp = temp.next;
	        }

	        while (right != null) {

	            if (right.key.equals(key) && hashCode == right.hashCode) {
	                left.next = right.next;
	                break;
	            }
	            left = left.next;
	            right = right.next;
	        }

	        // Reduce size
	        size--;

	        bucketArray.set(bucketIndex, temp);

	    }

	    // Returns value for a key
	    public K get(K key) {
	        // Find head of chain for given key
	        int bucketIndex = getBucketIndex(key);
	        int hashCode = hashCode(key);

	        HashNode<K> head = bucketArray.get(bucketIndex);

	        // Search key in chain
	        while (head != null) {
	            if (head.key.equals(key) && head.hashCode == hashCode)
	                return head.key;
	            head = head.next;
	        }

	        // If key not found
	        return null;
	    }

	    // Adds a key value pair to hash
	    public void add(K key, V value) {
	        // Find head of chain for given key
	        int bucketIndex = getBucketIndex(key); // 1
	        int hashCode = hashCode(key);

	        HashNode<K> head = bucketArray.get(bucketIndex);

	        // Check if key is already present
	        while (head != null) {
	            if (head.key.equals(key) && head.hashCode == hashCode) {
	                return;
	            }
	            head = head.next;
	        }

	        // Insert key in chain
	        size++;
	        head = bucketArray.get(bucketIndex); // head = null;
	        HashNode<K> newNode = new  HashNode<K>(key,hashCode);
	        newNode.next = head;
	        bucketArray.set(bucketIndex, newNode);

	    }

	    public void display() {

	        for ( HashNode<K> head : bucketArray) {
	        	 HashNode<K> temp = head;
	            if (head != null)
	                System.out.print(" [ " + bucketArray.indexOf(head) + " ]  ==> ");
	            else
	                System.out.println(" [   ]");
	            while (temp != null) {
	                System.out.print( temp.key + " ==>");
	                temp = temp.next;
	            }
	            if (head != null)
	                System.out.println();
	        }

	    }

	    // Driver method to test Map class
	    public static void main(String[] args) {
	       
	    	HashMap<Integer, Integer> map = new HashMap<>();

	        map.add(77, 10); // hashCode(1)%11 => bucket=>list=>add=>update
	        map.add(44, 45);
	        map.add(55, 87);
	        map.add(26, 100);
	        map.add(93, 77);
	        map.add(17, 77);
	        map.add(31, 77);
	        map.add(20, 77);
	        map.add(54, 77);
	        //map.display();
	       
	        ////map.remove(1000);
	       
	        map.display();
	    }
	}
