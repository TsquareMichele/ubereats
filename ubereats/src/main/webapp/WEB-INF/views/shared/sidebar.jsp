<h1 class="my-4">Discover restaurants that deliver near you.<br/><br/><br/> Select a category</h1>
       <div class="list-group">
       
       <c:forEach items="${categories}" var="category">
       
        <a href="${contextRoot}/show/category/${category.id}/restaurants" class="list-group-item" id="a_${category.name}" style="color:black;">${category.name}</a>
       
       </c:forEach>
          <br/>
          </div>
