defmodule Penelope.Repo do
  use Ecto.Repo,
    otp_app: :penelope,
    adapter: Ecto.Adapters.Postgres
end
