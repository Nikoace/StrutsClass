package Five;

import ognl.DefaultTypeConverter;

import java.util.Map;

public class MyProductConverter extends DefaultTypeConverter {
    @Override
    public Object convertValue(Map context, Object value, Class toType) {
        if (toType == String.class){
            MyProduct temp = (MyProduct) value;
            String res = temp.getName ()+","+temp.getPrice ()+","+temp.getCount ();
            return res;
        }else if (toType == MyProduct.class){
            String[] params = (String[]) value;
            String[] info = params[0].split ( "," );
            MyProduct res = new MyProduct ();
            res.setName ( info[0] );
            res.setPrice ( Double.parseDouble ( info[1] ) );
            res.setPrice ( Integer.parseInt ( info[2] ) );
            return res;
        }else {
            return null;

        }
    }
}
