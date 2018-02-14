package com.revature.dao;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import com.revature.entity.TfTech;
import com.revature.model.TechInfo;
public interface TechDao {
    
    /**
     * Gets a singular batch of the given name.
     * @param TechName - The name of the Technology to retrieve.
     * @return - A Technology object from the tech table.
     */
    
    public TfTech getTech(String techName) throws IOException;
    public TfTech getTechById(int id);
    public Map<Integer, TechInfo> getAllTechs();
    public Set<TechInfo> getTechFromCache();
}