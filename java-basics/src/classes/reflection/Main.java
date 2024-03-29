package classes.reflection;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {


        /*
            The package "java.lang.reflect" provides classes that can be used to access and manipulate
            the value like fields, methods, constructor etc.
            And these classes are generally returned by listed get Methods of Class only.
         */
        Class basicClass = BasicClassToLearnReflection.class;
        System.out.println(basicClass.getName());
        System.out.println(basicClass.getModifiers());

        //Reflection of methods
        Class reflectionOfMethod = ReflectionOfMethods.class;
        /*
            This will return all the public methods
            also, this will return all the methods from parents also like
            Object class is parent of every class, then it will return the methods of Object class always
         */
        Method[] methods = reflectionOfMethod.getMethods();

        for(Method m: methods) {
            System.out.println("Method name: " + m.getName());
            System.out.println("Retrun type: " + m.getReturnType());
            System.out.println("Decalring classes: " + m.getDeclaringClass());
            System.out.println("****************************************************************");
        }



        //REFLECTION OF DECLARED CLASSES i.e only methods from that class not from parent class i.e. Object class
        Method[] declaredMethods = reflectionOfMethod.getDeclaredMethods();
        System.out.println("Declared methods: ");
        for(Method m: declaredMethods) {
            System.out.println("Method name: " + m.getName());
            System.out.println("Retrun type: " + m.getReturnType());
            System.out.println("Decalring classes: " + m.getDeclaringClass());
            System.out.println("****************************************************************");
        }


        //invoking the method using reflection
        Class reflectionMethod = ReflectionOfMethods.class;
        Object classObject = reflectionMethod.newInstance();

        //it will try to fetch the method with the given name and given set of parameters
        Method flyMethod = reflectionMethod.getMethod("flyparams", int.class, String.class, boolean.class);
        flyMethod.invoke(classObject, 1, "abc", true);




        //FIELDS
        Class instanceForField = ReflectionOfMethods.class;
        System.out.println("\n\n\nDETAILS FOR FIELDS\n");

//        this will return only public fields
        Field[] fields = instanceForField.getFields();

        for(Field field : fields) {
            System.out.println("Method name: " + field.getName());
            System.out.println("Retrun type: " + field.getType());
            System.out.println("Decalring classes: " + field.getDeclaringClass());
            System.out.println("Modifier: " + Modifier.toString(field.getModifiers()));
            System.out.println("****************************************************************");
        }

        System.out.println("\n\n\nDETAILS FOR DECLARED FIELDS\n");

//        this will return public as well as private fields fields
        fields = instanceForField.getDeclaredFields();

        for(Field field : fields) {
            System.out.println("Method name: " + field.getName());
            System.out.println("Retrun type: " + field.getType());
            System.out.println("Decalring classes: " + field.getDeclaringClass());
            System.out.println("Modifier: " + Modifier.toString(field.getModifiers()));
            System.out.println("****************************************************************\n\n\n");
        }



        /*
            SETTING THE VALUE OF PUBLIC FIELD
         */
        Class classInstanceToSetValueOfField = ReflectionOfMethods.class;
        ReflectionOfMethods classObject2 = new ReflectionOfMethods();

        Field fieldToSetValue = classInstanceToSetValueOfField.getDeclaredField("breed");
        fieldToSetValue.set(classObject2, "BreedSet");
        System.out.println(classObject2.breed);






        /*
            SETTING THE VALUE OF PRIVATE FIELD
         */
        Class classToSetPrivateField = ReflectionOfMethods.class;
        ReflectionOfMethods classObject3 = new ReflectionOfMethods();

        Field fieldToSetPrivateValue = classInstanceToSetValueOfField.getDeclaredField("canSwim");
        /*
            I will get this error if i do so
            read "main" java.lang.IllegalAccessException: class classes.reflection.Main cannot access a member of class classes.reflection.ReflectionOfMethods with modifiers "private"
	        at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:392)
         */
//        fieldToSetPrivateValue.set(classObject3, "canSwim");
//        System.out.println(classObject2.canSwim + "\n\n");



        //we can access private fields like this
        fieldToSetPrivateValue.setAccessible(true);
        fieldToSetPrivateValue.set(classObject3, true);
        if(fieldToSetPrivateValue.getBoolean(classObject3)) {
            System.out.println("set true to the private field of the class.......");
        } //this is the drawback of reflection that we can access and change private fields also




        /*
            REFLECTION OF CONSTRUCTOR

            this breaks the rule of singleton
            even if the constructor is private then also we will be able to create the instance of
            that class
         */
        Class singletonClass = SingletonClass.class;
        Constructor[] constructors = singletonClass.getConstructors();
        for(Constructor constructor : constructors) {
            constructor.setAccessible(true);
            SingletonClass singletonClassObject = (SingletonClass) constructor.newInstance();
            singletonClassObject.fly();
        }

    }
}
