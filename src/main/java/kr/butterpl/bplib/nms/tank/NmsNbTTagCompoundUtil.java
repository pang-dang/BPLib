package kr.butterpl.bplib.nms.tank;

import kr.butterpl.bplib.nms.wrapper.NBTTagCompoundWrapper;
import lombok.Getter;

import java.lang.reflect.Method;
@Getter
public class NmsNbTTagCompoundUtil {

    private final Class<?> NBTTagCompoundClass;
    private final Method getStringMethod;
    private final Method setStringMethod;

    public NmsNbTTagCompoundUtil() {
        NmsOtherUtil nmsOtherUtil = NmsOtherUtil.getInstance();

        NBTTagCompoundClass = nmsOtherUtil.NBTTagCompound();
        getStringMethod = nmsOtherUtil.NBTTagCompound_getString();
        setStringMethod = nmsOtherUtil.NBTTagCompound_setString();
    }

    public NBTTagCompoundWrapper newInstance() {
        try {
            return new NBTTagCompoundWrapper(NBTTagCompoundClass.newInstance(), this);
        } catch (Exception e) {
            return null;
        }
    }
}