$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\terrainactivity\Terrain.feature');
formatter.feature({
  "line": 1,
  "name": "End to end Functionality",
  "description": "",
  "id": "end-to-end-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Registration button exists",
  "description": "",
  "id": "end-to-end-functionality;registration-button-exists",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open guru99 website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enter valid data on the page",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 9
    },
    {
      "cells": [
        "Title",
        "Miss"
      ],
      "line": 10
    },
    {
      "cells": [
        "First Name",
        "Nithya"
      ],
      "line": 11
    },
    {
      "cells": [
        "Surname",
        "Shanthanu"
      ],
      "line": 12
    },
    {
      "cells": [
        "Phone",
        "9807896541"
      ],
      "line": 13
    },
    {
      "cells": [
        "Year_DOB",
        "1994"
      ],
      "line": 14
    },
    {
      "cells": [
        "Month_DOB",
        "October"
      ],
      "line": 15
    },
    {
      "cells": [
        "Date_DOB",
        "17"
      ],
      "line": 16
    },
    {
      "cells": [
        "License Period",
        "10"
      ],
      "line": 17
    },
    {
      "cells": [
        "Occupation",
        "Social worker"
      ],
      "line": 18
    },
    {
      "cells": [
        "Address",
        "Rangan Street"
      ],
      "line": 19
    },
    {
      "cells": [
        "City",
        "Chennai"
      ],
      "line": 20
    },
    {
      "cells": [
        "Country",
        "India"
      ],
      "line": 21
    },
    {
      "cells": [
        "Postal code",
        "600 006"
      ],
      "line": 22
    },
    {
      "cells": [
        "Email id",
        "nithya@gmail.com"
      ],
      "line": 23
    },
    {
      "cells": [
        "Password",
        "urspassword@123"
      ],
      "line": 24
    },
    {
      "cells": [
        "Confirm password",
        "urspassword@123"
      ],
      "line": 25
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "the user registration should be successful",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User enters valid details",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 31
    },
    {
      "cells": [
        "nithya@gmail.com",
        "urspassword@123"
      ],
      "line": 32
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Successful Login",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "user enters valid data details on the page",
  "rows": [
    {
      "cells": [
        "Fields",
        "values"
      ],
      "line": 38
    },
    {
      "cells": [
        "Quantity",
        "2"
      ],
      "line": 39
    },
    {
      "cells": [
        "card_nmuber",
        "7493037578241902"
      ],
      "line": 40
    },
    {
      "cells": [
        "month",
        "02"
      ],
      "line": 41
    },
    {
      "cells": [
        "year",
        "2022"
      ],
      "line": 42
    },
    {
      "cells": [
        "cvv_code",
        "989"
      ],
      "line": 43
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "payment should be done",
  "keyword": "Then "
});
formatter.match({
  "location": "TerrainStepDefinition.open_guru99()"
});
formatter.result({
  "duration": 6109128600,
  "status": "passed"
});
formatter.match({
  "location": "TerrainStepDefinition.enter_data_Reg(DataTable)"
});
formatter.result({
  "duration": 11888702900,
  "status": "passed"
});
formatter.match({
  "location": "TerrainStepDefinition.success_Reg()"
});
formatter.result({
  "duration": 1070545800,
  "status": "passed"
});
formatter.match({
  "location": "TerrainStepDefinition.enter_data(DataTable)"
});
formatter.result({
  "duration": 7222661200,
  "status": "passed"
});
formatter.match({
  "location": "TerrainStepDefinition.success_login()"
});
formatter.result({
  "duration": 1024935000,
  "status": "passed"
});
formatter.match({
  "location": "TerrainStepDefinition.enter_Data(DataTable)"
});
formatter.result({
  "duration": 27435972100,
  "status": "passed"
});
formatter.match({
  "location": "TerrainStepDefinition.payment_Successful()"
});
formatter.result({
  "duration": 489533400,
  "status": "passed"
});
});