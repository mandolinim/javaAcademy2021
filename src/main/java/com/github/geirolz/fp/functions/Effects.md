#Effects

An effect is a construct that encapsulate a value that handling specific scenarios  
They are expressed as `F[A]` in the sign of the function/method

###Optional

`
Optional<A>
`

Handle the presence or absence of a value

###CompletableFuture

`
CompletableFuture<A>
`

CompletableFuture represents a result of an asynchronous computation that may or may not be available yet.

###List/Stream

`List<A>` / `Stream<A>`

Handle the presence or absence of multiple values

---
#Optional
A "box" containing a value that can be present or not.

`.isPresent` return true if the optional wrap a value, false if wrap `null` value
```java
    Optional<String> some = Optional.ofNullable("Some value");
    assertTrue(some.isPresent()); 

    Optional<String> none = Optional.ofNullable(null);
    assertFalse(none.isPresent());
```

You can retrieve the wrapped value in an unsafe way with `.get()`
```java 
    Optional<String> some = Optional.ofNullable("Some value");
    String value = some.get();
    
    Optional<String> none = Optional.ofNullable(null);
    none.get() //will throw exception (NoSuchElementException)
```
---
## Map and filter

`.map` can be used to modify (mapping) the wrapped value without worrying about the possible null value providing a function `A -> B`
```java
    Optional<Integer> some = Optional.ofNullable(5);
    Optional<String> someString = some.map(v -> v.toString);
    assertTrue(some.isPresent()); 
    assertEquals(some.get(), "5"); 

    Optional<Integer> none = Optional.ofNullable(null);
    Optional<String> noneString = none.map(v -> v.toString);
    assertFalse(noneString.isPresent());
```

`.filter` will take a function that return a boolean `(A -> bool)` value based on our filtering logic, potentially transforming an option with a value in an empty option
```java
    Optional<Integer> some = Optional.ofNullable(5);
    Optional<Integer> filteredValue = some.filter(v -> v < 10);
    assertTrue(some.isPresent());
    assertEquals(some.get(), 5);

    Optional<Integer> some = Optional.ofNullable(11);
    Optional<Integer> filteredValue = some.filter(v -> v < 10);
    assertFalse(noneString.isPresent());
```

---
#Exercises optional

---
#List/Stream


---
#Exercises stream
