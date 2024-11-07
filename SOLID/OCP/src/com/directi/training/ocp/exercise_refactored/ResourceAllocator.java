package com.directi.training.ocp.exercise_refactored;

import java.util.HashMap;
import java.util.Map;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;
    private final Map<String, Resource> resources = new HashMap<>();
    public ResourceAllocator() {
     
        resources.put("TIME_SLOT", new TimeSlotResource());
        resources.put("SPACE_SLOT", new SpaceSlotResource());
    }

    public int allocate(String resourceType) {
        Resource resource = resources.get(resourceType);
        if (resource != null) {
            return resource.allocate();
        }
        System.out.println("ERROR: Attempted to allocate invalid resource");
        return INVALID_RESOURCE_ID;
    }

    public void free(String resourceType, int resourceId) {
        Resource resource = resources.get(resourceType);
        if (resource != null) {
            resource.free(resourceId);
        } else {
            System.out.println("ERROR: Attempted to free invalid resource");
        }
    }
}
