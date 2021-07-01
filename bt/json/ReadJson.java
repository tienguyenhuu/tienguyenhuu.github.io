package json;

import java.util.List;

public class ReadJson {
  private List<Person> people = new ArrayList<Person>();

  //Constructor đọc toàn bộ dữ liệu từ JSON vào
  public ReadJson() {
    ObjectMapper mapper = new ObjectMapper();
    mapper.registerModule(new JavaTimeModule());
    File file;
    try {
      file = ResourceUtils.getFile("classpath:static/Data.json");
      people.addAll(mapper.readValue(file, new TypeReference<List<Person>>(){}));      
    } catch (JsonParseException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {  
      e.printStackTrace();
    }
  }
  
}
