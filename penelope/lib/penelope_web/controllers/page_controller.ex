defmodule PenelopeWeb.PageController do
  use PenelopeWeb, :controller

  def index(conn, _params) do
    render(conn, "index.html")
  end
end
