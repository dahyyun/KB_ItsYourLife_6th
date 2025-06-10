// // 데이터베이스를 tutorial로 선정하세요.
// use tutorial
//
// // users 컬렉션에 username이 smith인 문서를 저장하세요.
// db.users.insertOne({username : "smith"})
//
// // users 컬렉션에 username이 jones인 문서를 저장하세요.
// db.users.insertOne({username : "jones"})
//
// // 앞에서 저장한 모든 문서를 출력하세요.
// db.users.find()
//
// // 앞에서 저장한 문서 중 하나만 출력하세요.
// db.users.findOne()
// /* db.users.find().limit(1) 은 sort, skip 등과 함께 사용할 때 좋음. */
//
// // users 컬렉션에서 username이 "jones"인 문서를 찾아서 출력하세요.
// db.users.find({
//     username : "jones"
// })
//
// // users 컬렉션에서 username이 "jones" 또는 "smith"인 문서를 찾아서 출력하세요.
// db.users.find({
//     $or : [
//         {username : "jones"},
//         {username : "smith"}
//     ]
// })
//
// // users 컬렉션에서 username이 smith인 문서에 country 키가 Canada가 되도록 수정하세요.
// db.users.updateOne({
//     username : "smith"
// }, {
//     $set : { country : "Canada" }
// })
//
// // 앞의 문서가 올바르게 수정되었는지 확인하세요.
// db.users.find({country : "Canada"})
//
// // users 컬렉션에서 username이 smith인 문서를 {country : "Canada"}로 대체하고 확인하세요.
// db.users.replaceOne({
//     username : "smith"
// }, {
//     country : "Canada"
// })
//
// db.users.find()
//
// // users 컬렉션에서 country가 Canada인 문서를 {username : "smith", country : "Canada"}로 대체하고 확인하세요.
// db.users.replaceOne({
//     country : "Canada"
// }, {
//     username : "smith",
//     country : "Canada"
// })
//
// // users 컬렉션에서 username이 smith인 문서에서 country 키를 삭제하고, 삭제 여부를 확인하세요.
// db.users.drop({
//     username : "smith"
// }, {
//     country : "Canada"
// })
//
// db.users.find()
//
// // 데이터베이스 전체 목록을 출력하세요.
// show databases
//
// // 현재 사용 중인 데이터베이스의 컬렉션 목록을 출력하세요.
// show collections
//
// // 현재 사용 중인 데이터베이스와 users 컬렉션의 상태를 출력하세요.
// db.stats()
//
// db.users.stats()
//
// // users 컬렉션에서 username이 smith인 문서를 삭제하고, 삭제 여부를 확인하세요.
// db.users.deleteOne({
//     username : "smith"
// })
//
// db.users.find({username : "smith"})
//
// // users 컬렉션의 모든 문서를 삭제하고, 삭제 여부를 확인하세요.
// db.users.deleteMany({})
//
// db.users.find()
//
// // users 컬렉션을 삭제하세요.
// db.users.drop()