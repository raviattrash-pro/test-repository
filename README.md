Exception handling details


In the Exception handling first we create a excetion package 

inside exception package we can create 3 class

1.    Class inherit runtime exception -> call the constructor => super keyword

2.     Bean class for the Exception format

3.    Exception controller class -> with @ControllerAdvice -> @ExceptionHandler(ClassNameYouwantto call.class) -> function ->public final ResponseEntity<Object>               handleProductNotFoundException(Exception ex, WebRequest request) -> object of ExceptionFormatClass -> pass this value ex.getMessage(),new                                 Date(),request.getDescription(false) in the constructor ->  return new ResponseEntity(ExceptionClassName, HttpStatus.NOT_FOUND) ;
