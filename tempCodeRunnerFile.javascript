const crypto = require("crypto");
const request = require("request");

// const express = require("express");
// const app = express();
// const port = process["env"]["PORT"] || 3500;

// app["get"]("/", (req, res) => {
//   console.log("/");
//   res.send("i am alive");
// });

//

function getSpamCount() {
  let u0 = [10, 20, 30, 40, 50, 60];
  var K = u0[Math["floor"](Math["random"]() * u0["length"])];
  return K;
}

function getSpamContent() {
  let data = crypto.randomBytes(getSpamCount()).toString("hex");
  return data;
}

function getSpamTime() {
  let u0 = [2000, 3000, 2250, 2500];
  var K = u0[Math["floor"](Math["random"]() * u0["length"])];
  return K;
}

function startSpam() {
  console.log("spam started.....");

  // 5.9
  setInterval(() => {
    try {
      request({
        method: "POST",
        url: `https://discord.com/api/v9/channels/1008050973232611378/messages`,
        headers: {
          authorization:
            "MTA0MDU0MTQ1MDE0MTY5NjAzMQ.GGzGqF.pcVTgNEzJT69kiPt0IHSFzID9CZdndTamNMbKY",
        },
        form: { content: getSpamContent() },
      });
    } catch (error) {
      console.log(error);
    }
  }, getSpamTime());


}


console.log("=-=-=-=--=-=--=-=-=-=-=-=-=-=-=-=-=-=-=");
console.log("new set started");
startSpam();