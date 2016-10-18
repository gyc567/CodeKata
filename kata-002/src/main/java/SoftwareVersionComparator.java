import java.util.Comparator;

public class SoftwareVersionComparator implements Comparator<String> {

    /**
     * Compares two software version strings. Software versions are made of
     * a maximum of 5 integers separated by dots. For example these are all
     * allowed version numbers:
     * <p/>
     * <ul>
     * <li>3</li>
     * <li>1.9.2</li>
     * <li>3.0.678.34.9</li>
     * </ul>
     *
     * @param version1 first version String
     * @param version2 second version String
     * @return a negative integer if version1 is smaller than version2,
     * zero if version1 equals version2, a positive integer
     * if version1 is greater than version 2
     */
    @Override
    public int compare(String version1, String version2) {


        if (version1.equals(version2)) {
            return 0;
        } else if (!version1.contains(".")&&version2.contains(".")) {
            String vstrin[]=version2.split("\\.");
            if(Integer.valueOf(version1)==Integer.valueOf(vstrin[0]))
                return -1;
        }else if(version1.contains(".")&&!version2.contains("."))
        { String vstrin[]=version1.split("\\.");
            if(Integer.valueOf(version1)==Integer.valueOf(vstrin[0]))
                return 1;
        }else if (!version1.contains(".")&&!version2.contains("."))
        {
            return getIntForCompareIntString(version1, version2);

        }else if (version1.contains(".")&&version2.contains("."))
        {
            String vstrin1[]=version1.split("\\.");
            String vstrin2[]=version2.split("\\.");
            if(vstrin1[0]!=vstrin2[0])
            {
                return getIntForCompareIntString(vstrin1[0],vstrin2[0]);

            }
        }
        return -1;
    }

    private int getIntForCompareIntString(String version1, String version2) {
        return Integer.valueOf(version1)-Integer.valueOf(version2);
    }
}