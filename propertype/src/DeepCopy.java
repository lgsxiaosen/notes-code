import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuguisen
 * @date 2019/4/19 18:06
 * @description
 */
public class DeepCopy implements Cloneable {
    private ArrayList<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    public void setList(String value) {
        this.list.add(value);
    }

    @Override
    protected DeepCopy clone() throws CloneNotSupportedException {
        DeepCopy deepCopy = (DeepCopy) super.clone();
        deepCopy.list = (ArrayList<String>) this.list.clone();
        return deepCopy;
    }

    public static <T> List<T> depCopy(List<T> srcList) {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        try {
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(srcList);
            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
            ObjectInputStream inStream = new ObjectInputStream(byteIn);
            List<T> destList = (List<T>) inStream.readObject();
            return destList;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) throws CloneNotSupportedException{
        DeepCopy deepCopy = new DeepCopy();
        deepCopy.setList("xiaosen");
        System.out.println(deepCopy.getList());
        DeepCopy deepCopy1 = deepCopy.clone();
        deepCopy1.setList("lalala");
        System.out.println(deepCopy.getList());
        System.out.println(deepCopy1.getList());

        List<String> deepCopy2 = DeepCopy.depCopy(deepCopy.getList());
        System.out.println(deepCopy2);
    }
}
