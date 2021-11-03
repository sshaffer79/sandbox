package com.shaffer;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.*;

public class JsonDuplicateSearch {
    static String json = "[\n" +
            "    {\n" +
            "      \"id\": 7,\n" +
            "      \"streetName\": \"S Artesian Ave\",\n" +
            "      \"houseNumber\": 7016,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60629,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 8,\n" +
            "      \"streetName\": \"S Artesian Ave\",\n" +
            "      \"houseNumber\": 7018,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60629,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 9,\n" +
            "      \"streetName\": \"S California Ave\",\n" +
            "      \"houseNumber\": 7336,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60629,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 10,\n" +
            "      \"streetName\": \"S Campbell Ave\",\n" +
            "      \"houseNumber\": 6943,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60629,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 11,\n" +
            "      \"streetName\": \"S Campbell Ave\",\n" +
            "      \"houseNumber\": 7914,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 12,\n" +
            "      \"streetName\": \"S Christiana Ave\",\n" +
            "      \"houseNumber\": 7708,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 115,\n" +
            "      \"streetName\": \"S Kedzie Ave\",\n" +
            "      \"houseNumber\": 9643,\n" +
            "      \"city\": \"Evergreen Park\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60805,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 117,\n" +
            "      \"streetName\": \"S Kedzie Ave\",\n" +
            "      \"houseNumber\": 9643,\n" +
            "      \"city\": \"Evergreen Park\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60805,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 13,\n" +
            "      \"streetName\": \"S Kenneth Ave\",\n" +
            "      \"houseNumber\": 8401,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 14,\n" +
            "      \"streetName\": \"S Kildare Ave\",\n" +
            "      \"houseNumber\": 7916,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 15,\n" +
            "      \"streetName\": \"S Mozart St\",\n" +
            "      \"houseNumber\": 7216,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60629,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 37,\n" +
            "      \"streetName\": \"S Mozart St\",\n" +
            "      \"houseNumber\": 7948,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 16,\n" +
            "      \"streetName\": \"S Mozart St\",\n" +
            "      \"houseNumber\": 8125,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 5,\n" +
            "      \"streetName\": \"S Richmond St\",\n" +
            "      \"houseNumber\": 7915,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 17,\n" +
            "      \"streetName\": \"S Richmond St\",\n" +
            "      \"houseNumber\": 7934,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 18,\n" +
            "      \"streetName\": \"S Richmond St\",\n" +
            "      \"houseNumber\": 7938,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 19,\n" +
            "      \"streetName\": \"S Richmond St\",\n" +
            "      \"houseNumber\": 8033,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 20,\n" +
            "      \"streetName\": \"S Sacramento Ave\",\n" +
            "      \"houseNumber\": 7938,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 6,\n" +
            "      \"streetName\": \"S Sacramento Ave\",\n" +
            "      \"houseNumber\": 8215,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 21,\n" +
            "      \"streetName\": \"S Sawyer Ave\",\n" +
            "      \"houseNumber\": 7159,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60629,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 22,\n" +
            "      \"streetName\": \"S Troy St\",\n" +
            "      \"houseNumber\": 8228,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 24,\n" +
            "      \"streetName\": \"S Trumbull Ave\",\n" +
            "      \"houseNumber\": 7742,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 23,\n" +
            "      \"streetName\": \"S Trumbull Ave\",\n" +
            "      \"houseNumber\": 7929,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 25,\n" +
            "      \"streetName\": \"S Washtenaw Ave\",\n" +
            "      \"houseNumber\": 7121,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60629,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 26,\n" +
            "      \"streetName\": \"S Washtenaw Ave\",\n" +
            "      \"houseNumber\": 7125,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60629,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 27,\n" +
            "      \"streetName\": \"S Washtenaw Ave\",\n" +
            "      \"houseNumber\": 7240,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60629,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 28,\n" +
            "      \"streetName\": \"W 71st St\",\n" +
            "      \"houseNumber\": 2122,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60636,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 29,\n" +
            "      \"streetName\": \"W 71st St\",\n" +
            "      \"houseNumber\": 2136,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60636,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 30,\n" +
            "      \"streetName\": \"W 73rd St\",\n" +
            "      \"houseNumber\": 5353,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60638,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 76,\n" +
            "      \"streetName\": \"W 75th Pl\",\n" +
            "      \"houseNumber\": 2126,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60620,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 31,\n" +
            "      \"streetName\": \"W 79th Pl\",\n" +
            "      \"houseNumber\": 3751,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 32,\n" +
            "      \"streetName\": \"W 80th Pl\",\n" +
            "      \"houseNumber\": 3824,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 33,\n" +
            "      \"streetName\": \"W 81st St\",\n" +
            "      \"houseNumber\": 3838,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 116,\n" +
            "      \"streetName\": \"W 83rd Pl\",\n" +
            "      \"houseNumber\": 2715,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 34,\n" +
            "      \"streetName\": \"W 83rd St\",\n" +
            "      \"houseNumber\": 3827,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 35,\n" +
            "      \"streetName\": \"W 84th St\",\n" +
            "      \"houseNumber\": 3349,\n" +
            "      \"city\": \"Chicago\",\n" +
            "      \"state\": \"IL\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postalCode\": 60652,\n" +
            "      \"address2\": \"\",\n" +
            "      \"note\": \"\",\n" +
            "      \"lastUpdated\": {\n" +
            "        \"dateTimestamp\": 1635944340\n" +
            "      },\n" +
            "      \"$added\": true\n" +
            "    }\n" +
            "  ]";

    public static void main(String[] args) {
        System.out.println("test");

        Gson gson = new Gson();
        JsonArray array = gson.fromJson(json, JsonArray.class);

        Set<Integer> hashes = new HashSet<>();

        Iterator<JsonElement> elements = array.iterator();
        while (elements.hasNext()) {
            JsonObject jsonObject = elements.next().getAsJsonObject();
            String[] attributes = {"houseNumber", "streetName", "postalCode"};

            int key = getKey(jsonObject, attributes);
            if (hashes.contains(key)) {
                System.out.println(jsonObject);
            } else {
                hashes.add(key);
            }
        }

        System.out.println("done");
    }

    private static int getKey(JsonObject jsonObject, String[] attributes) {
        List<String> values = new ArrayList<>();
        for (String attribute : attributes) {
            String attributeValue = jsonObject.get(attribute).getAsString();
            values.add(attributeValue);
        }

        return Objects.hash(values);
    }
}
