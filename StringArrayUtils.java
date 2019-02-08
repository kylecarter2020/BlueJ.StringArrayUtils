 import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean b = false;
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].equals(value))
            {
                b = true;
            }
        }
        
        return b;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] rev = new String[array.length];
        
        for(int i = 1; i <= array.length; i++)
        {
            rev[i-1] = array[array.length - i];
        }
        
        return rev;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] rev = new String[array.length];
        rev = reverse(array);
        boolean result = true;
        
        for(int i = 0; i < array.length; i++)
        {
            if(!(array[i].equals(rev[i])))
            {
                result = false;
            }
        }
        
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean result = false;
        String bigWord = "";
        ArrayList<Character> list = new ArrayList<Character>();
        
        for(String str : array)
        {
            bigWord += str;
        }
        
        for(int i = 0; i < bigWord.length(); i++)
        {
            if(!(bigWord.charAt(i) == ' ') && !(list.contains(Character.toLowerCase(bigWord.charAt(i)))))
            {
                list.add(Character.toLowerCase(bigWord.charAt(i)));
            }
            
        }
        
        if(list.size() == 26)
        {
            result = true;
        }
        
        System.out.println(list);
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0; 
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].equals(value))
            {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
        
        while(list.contains(valueToRemove))
        {
            list.remove(valueToRemove);
        }
        
        String[] result = list.toArray(new String[list.size()]);
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i = 0; i < array.length; i++)
        {
            list.add(array[i]);
            
            for(int j = i+1; j < array.length; j++)
            {
                if(array[i].equals(array[j]))
                {
                    i++;
                }
                else
                {
                    j = array.length;
                }

            }
            
        }
        
        String[] result = list.toArray(new String[list.size()]);
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String temp = "";
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i = 0; i < array.length; i++)
        {
            temp += array[i];
            
            for(int j = i+1; j < array.length; j++)
            {
                if(array[i].equals(array[j]))
                {
                    temp += array[j];
                    i++;
                }
                else
                {
                    j = array.length;
                }
            }
            
            list.add(temp);
            temp = "";
            
        }
        
        String[] result = list.toArray(new String[list.size()]);
        return result;
    }


}
