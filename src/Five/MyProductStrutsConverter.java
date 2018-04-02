package Five;

import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

public class MyProductStrutsConverter extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        String[] infos = strings[0].split ( "," );
        MyProduct product = new MyProduct ();
        product.setName ( infos[0] );
        product.setPrice ( Double.parseDouble ( infos[1] ) );
        product.setCount ( Integer.parseInt ( infos[2] ) );
        return product;
    }

    @Override
    public String convertToString(Map map, Object o) {
        MyProduct product = (MyProduct) o;
        return product.getName ()+","+product.getPrice ()+","+product.getCount ();
    }
}
