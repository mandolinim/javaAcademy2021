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
##Optional
A "box" containing a value that can be present or not.

`.isPresent` return true if the optional wrap a value, false if it wraps `null`
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
Or get a default value with `.orElse(...)`
```java 
    Optional<String> none = Optional.ofNullable(null);
    
    assertEquals(none.orElse("foo"), "foo"); 
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
##Try it yourself!
Take a look at tests called `DiscountTest` and `ItemTest`

Launch the test and fix the code :)   

Refactor the affected classes using the functional concepts and methods previously described 

---
#List/Stream

###List 
A container of multiple values or empty with the purpose of efficient access to values

###Stream
A lazy and immutable container of multiple values or empty with the purpose of computational operations

---
## Stream
### Initialization
To initiate a stream we use `.stream()` on a collection
```java
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    Stream<Integer> stream = list.stream();
```

### map() and filter()
We can transform each element of the Stream with function `.map()` providing the mapper function `A -> B` 

```java
    // multiply all elements by two
    Stream<Integer> modifiedStream = stream.map(x -> x * 2);
```
We can filter out some elements given a function that return a boolean `(A -> bool)`.
```java
    // filter out odd values
    Stream<Integer> filteredStream = stream.filter(x -> x % 2 == 0); 
```
---
#Terminal operations
Being `Stream` a lazy construct no operation is performed until a "Terminal operation" is invoked.
Some example are:

Materialize the stream in a single value

* `.average()`
* `.count()`
* `.reduce(T identity, (T acc, T cur) -> T);`

```java
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    int result = numbers
        .stream()
        .reduce(0, (subtotal, current) -> subtotal + current);

    assertEquals(result, 21);
```

Materialize the stream in a specified collection (List, Set, Map ...)
* `.collect(...)` 


---
##Try it yourself!
Take a look at tests called `DiscountTest` and `ItemTest`

Launch the test and fix the code :)

Refactor the affected classes using the functional concepts and methods previously described 

