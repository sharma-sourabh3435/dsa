//Hashmap stores items in key/value pairs and we can access
//them by an index of another type
/**
One object is used as key(index) to another object(value). 
package: import java.util.HashMap;
Initialize: HashMap<Object, Object> map = new HashMap<Object, Object>();
add items : map.put(key, value);
get items : map.get(key) returns value
remove items : map.remove(key)
remove all : map.clear()
size : map.size()
loop through hashmap:

Use keySet() method if you only need keys, and use values() if you need
values.

// print keys
for (String i : map.keySet()) {
    System.out.println(i);
}

//print values
for (String i : map.values()) {
    System.out.println(i);
}

To check whether a particular key is being mapped into hashmap or not.

 */