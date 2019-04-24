import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaosen
 * @date 2019/4/19 17:50
 * @description
 */
public class ShallowClone implements Cloneable {
    private List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    public void setList(String value) {
        this.list.add(value);
    }

    @Override
    protected ShallowClone clone() throws CloneNotSupportedException {
        return (ShallowClone) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        ShallowClone shallowClone = new ShallowClone();
        shallowClone.setList("xiaosen");
        System.out.println(shallowClone.getList());
        ShallowClone shallowClone1 = shallowClone.clone();
        shallowClone1.setList("lalala");
        System.out.println(shallowClone.getList());
        System.out.println(shallowClone1.getList());
    }

}
