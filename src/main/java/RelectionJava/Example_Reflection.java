package main.java.RelectionJava;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Example_Reflection {
    public static void main(String[] args) throws Exception{
        Class<?> stringClassObj = String.class;
        Method toUpperCaseMethod = stringClassObj.getMethod("toUpperCase");

        String s = "hello";

        String res = (String) toUpperCaseMethod.invoke(s);
        System.out.println(res);

        Class padetails = Class.forName("main.java.RelectionJava.MeraClass");
        System.out.println(padetails+" +++++++++");
        Method[] methods = padetails.getMethods();
        for (Method method: methods) {
            String methodName = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            int modifiers = method.getModifiers();
            String modifierString = Modifier.toString(modifiers);
            System.out.println("Method Names are : "+ methodName);
            System.out.println("Parameters types are : "+ parameterTypesToString(parameterTypes));
            System.out.println(" Return types are : "+ returnType);
            System.out.println("Modifiers : "+ modifierString);
            System.out.println();
        }

    }
    private static String parameterTypesToString(Class<?>[] parameterTypes) {
        if (parameterTypes.length == 0) {
            return "No Parameters";
        }
        StringBuilder sb = new StringBuilder();
        for (Class<?> parameterType: parameterTypes) {
            sb.append(parameterType.getName()).append(", ");

        }
        sb.delete(sb.length()-2,sb.length());
        return sb.toString();
    }
}
