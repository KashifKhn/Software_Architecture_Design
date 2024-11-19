100 student apply for the addmisison we have to filter from them
first we have to check that they are eligibliity and then pass them to test stage then the did test after test check the eligiblity again of test mark if the pass then call them to interview also after interview filter them more and call them for the addminsion of the merit list

we will use the pipe and filter for filter studnet on each on base of criteira then use the observer pattern to notfiy them with proper message for next and also to those which not pass the stage

we will be use the spring boot for this follow the best desing and proper orgainze the code we willl be use the spring boot DI of constructer

our api routes,

first stage 1 for eligibilty
/apply method POST
{
student : [
{
name: "",
fsc: marks,
metric: marks,
test: marks
},
]
}

after that we have to filter for test and also assign a uninqe id to each

add the how are eligble for test after that add them to obser and notfiy them for the them for interview
after interview fitlte them again and

eligibility -> test -> interview -> meritlist

when the
/test?notfi=fail or pass GET
throgh obser pattern
send the respon of {
fail : []
pass: []
}

/interview?notify=passorfail
send the respon of {
fail : []
pass: []
}

/merit-list?notify=passorfail
send the respon of {
fail : []
pass: []
}

use the proper pakave of like servie controller and each obser pipefilter
to best of this
