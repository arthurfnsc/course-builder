# course-builder

Thinkific - Course Builder

Why

Online course creators are always looking for the "best" tool to build their courses, something
that is extremely powerful, content-rich, customizable and yet very simple to use. We at Thinkific
are very proud of the solution that we've built, but we are very curious about others’ take on this
challenge so we want to see what they would visualize.

What

To help our course creators easily create and offer amazing content, we’d like a web application
that lets people create complete courses.

Basic Specs:
1. Should allow users to create courses with the following fields
a. name (not to exceed 255 characters)
b. subtitle (not to exceed 255 characters)
c. description (unlimited size and must allow HTML)
d. price (precision of 8 digits and scale of 2)
e. duration - decimal (precision of 5 digits and scale of 1)

2. Upon course creation users should be allowed to edit any of its fields

3. Should allow users to add chapter with a title (not to exceed 255 characters)

4. Should allow users to add content with a title (not to exceed 255 characters)
a. Should allow users to upload files
b. Should allow users to create contents based on HTML text, audio, video, pdf and
download
c. For contents that input comes from uploaded files, each content should restrict its
file type

5. Should allow users to edit chapter

6. Should allow users to edit content

7. Should allow users to change the order of the chapters

8. Should allow users to change the order of the contents

9. Should allow users to move content from one chapter to another
Stretch Specs:
1. Bulk Importer - Allow users to bulk import multimedia contents creating a library for the
course from which the user can reference on the content creation
Deliverables
1. A web application that can be run on a local development machine. All source code
written in your language of choice (Fortran)

#usage
1 - Initialize local MongoDB

2 - Execute:

[For Eclipse users] ./gradlew :course-builder-api:clean eclipse generateSwaggerCode bootRun

[For IntelliJ users] ./gradlew :course-builder-api:clean idea generateSwaggerCode bootRun
