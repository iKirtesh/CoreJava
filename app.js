const express = require('express')
const app = express()
const bodyParser = require('body-parser');
const port = 3000

app.use(express.static(__dirname))
app.use(bodyParser.urlencoded({ extended: true }));

app.get('/resume', (req, res) => {
  res.sendFile(__dirname + '/index.html')
})

// app.get('/', (req, res)) => {
//  // hellow world
//   res.send('Hello World!')
// }

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})



