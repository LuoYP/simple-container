package org.example.factory;

import cn.hutool.core.util.ReflectUtil;
import org.example.element.ElementDefinition;
import org.example.factory.warehouse.MaterialWarehouse;
import org.example.factory.warehouse.SemiFinishedWarehouse;
import org.example.factory.workshop.ProcessWorkshop;

import java.lang.reflect.Constructor;
import java.util.List;

/**
 * 元素工厂，用于实例化
 */
public class ElementFactory {

    //记录创建元素的原始信息
    private MaterialWarehouse materialWarehouse;

    //未注入依赖的元素仓库
    private SemiFinishedWarehouse semiFinishedWarehouse;

    private List<ProcessWorkshop> processWorkshops;

    public static ElementFactory getInstance() {
        return new ElementFactory();
    }

    public List<?> getElementByName(String name) {

    }

    public <T> T process(Class<?> target) {
        ElementDefinition definition = container.getElementDefinition(target);
        if (null == definition) {
            return null;
        }
        Constructor<?>[] constructors = ReflectUtil.getConstructors(target);
    }
}
