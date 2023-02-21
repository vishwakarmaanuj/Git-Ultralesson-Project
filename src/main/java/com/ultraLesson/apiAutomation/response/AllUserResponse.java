package com.ultraLesson.apiAutomation.response;

import lombok.Data;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Data
public class AllUserResponse {

    private int statusCode;


    public List<Data> dataList;
    public int total;
    public int page;
    public int limit;

    public boolean hasId() {
        return dataList.stream()
                .anyMatch(data -> data.getId().contains("20d"));
    }

    public void assetUser() {
        assertEquals(this.getStatusCode(), 200);
        assertEquals(this.getPage(), 0);
        assertEquals(this.getLimit(), 10);
        assertEquals(this.getDataList().size(), 10);
        assertTrue(this.hasId());
    }

   @lombok.Data
    public static class Data {
        public String id;
        public String title;
        public String firstName;
        public String lastName;
        public String picture;
    }
}
