engine.put("name", "Venkat");
engine.eval("println \"Hello ${name} from Groovy\"; name += '!' ");
String name = (String) engine.get("name");
System.out.println("Back in Java:" + name);
